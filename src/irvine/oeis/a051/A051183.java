package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051183 Number of 6-element intersecting families of an n-element set.
 * @author Sean A. Irvine
 */
public class A051183 extends Sequence0 {

  private static final int[][] C = {
    {1, 64},
    {-15, 48},
    {60, 40},
    {-15, 36},
    {30, 34},
    {-6, 33},
    {-215, 32},
    {-180, 30},
    {585, 28},
    {45, 27},
    {60, 26},
    {150, 25},
    {-510, 24},
    {-360, 23},
    {168, 22},
    {-585, 21},
    {795, 20},
    {1665, 19},
    {-1890, 18},
    {-2175, 17},
    {3305, 16},
    {1775, 15},
    {-3795, 14},
    {-870, 13},
    {3123, 12},
    {-1075, 11},
    {-495, 10},
    {1460, 9},
    {-2245, 8},
    {1424, 7},
    {150, 6},
    {-590, 5},
    {499, 4},
    {-274, 3},
    {-120, 2},
    {120, 1}
  };

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final int[] c : C) {
      sum = sum.add(Z.valueOf(c[1]).pow(mN).multiply(c[0]));
    }
    return sum.divide(720);
  }
}
