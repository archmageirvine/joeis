package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051114 Number of monotone Boolean functions of n variables with 6 mincuts.
 * @author Sean A. Irvine
 */
public class A051114 implements Sequence {

  private final int[][] C = {
    {1, 64},
    {-30, 48},
    {120, 40},
    {60, 36},
    {60, 34},
    {-12, 33},
    {-345, 32},
    {-720, 30},
    {810, 28},
    {120, 27},
    {480, 26},
    {360, 25},
    {-480, 24},
    {-720, 23},
    {-240, 22},
    {-540, 21},
    {1380, 20},
    {750, 19},
    {60, 18},
    {-210, 17},
    {-1535, 16},
    {-1820, 15},
    {2250, 14},
    {1800, 13},
    {-2820, 12},
    {300, 11},
    {2040, 10},
    {340, 9},
    {-1815, 8},
    {510, 7},
    {-1350, 6},
    {1350, 5},
    {274, 4},
    {-548, 3},
    {120, 2},
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
