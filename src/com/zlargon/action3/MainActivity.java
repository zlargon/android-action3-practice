package com.zlargon.action3;

import android.app.ActionBar;
import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class MainActivity extends Activity implements OnNavigationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setup action bar
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        SpinnerAdapter adapter = ArrayAdapter.createFromResource(
            getApplication(),
            R.array.day_of_week,
            android.R.layout.simple_spinner_item
        );
        actionBar.setListNavigationCallbacks(adapter, this);
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        String[] day_of_week = getResources().getStringArray(R.array.day_of_week);
        Toast.makeText(this, day_of_week[itemPosition] + " is clicked", Toast.LENGTH_SHORT).show();
        return false;
    }
}
