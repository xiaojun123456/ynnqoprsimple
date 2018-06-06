package com.ynnqo.pr;

import android.graphics.Point;

/**
 * Created by xiaojun on 2018/3/9.
 */

public class result {

    private String name;

    private Point[] points;

    public void setName(String SellerCode){
        this.name = SellerCode;
    }
    public String getName(){
        return this.name;
    }

    public void setPoints(Point[] points){this.points = points;}
    public Point[] getPoints(){return this.points;}

}
