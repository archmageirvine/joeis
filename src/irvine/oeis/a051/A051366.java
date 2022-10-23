package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051366 Number of 6-element families of an n-element set such that every 4 members of the family have a nonempty intersection.
 * @author Sean A. Irvine
 */
public class A051366 extends Sequence0 {

  private static final int[][] C = {
    {1, 64},
    {-15, 60},
    {60, 58},
    {25, 57},
    {-240, 56},
    {45, 55},
    {705, 54},
    {-987, 53},
    {-351, 52},
    {3040, 51},
    {-5445, 50},
    {6105, 49},
    {-4939, 48},
    {2997, 47},
    {-1365, 46},
    {455, 45},
    {-105, 44},
    {15, 43},
    {-1, 42},
    {-15, 32},
    {75, 30},
    {-150, 29},
    {150, 28},
    {-75, 27},
    {15, 26},
    {85, 16},
    {-85, 15},
    {-225, 8},
    {225, 7},
    {274, 4},
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
