package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051363 Number of 6-element families of an n-element set such that every 3 members of the family have a nonempty intersection.
 * @author Sean A. Irvine
 */
public class A051363 implements Sequence {

  private static final int[][] C = {
    {1, 64},
    {-20, 56},
    {90, 52},
    {30, 50},
    {25, 49},
    {-420, 48},
    {-180, 47},
    {450, 46},
    {60, 45},
    {615, 44},
    {1683, 43},
    {-3252, 42},
    {-6030, 41},
    {8520, 40},
    {10560, 39},
    {-15849, 38},
    {-13005, 37},
    {26410, 36},
    {10655, 35},
    {-50385, 34},
    {33390, 33},
    {29480, 32},
    {-82010, 31},
    {91215, 30},
    {-67380, 29},
    {36870, 28},
    {-15249, 27},
    {4380, 26},
    {-1215, 25},
    {1390, 24},
    {-695, 23},
    {-1574, 22},
    {3255, 21},
    {-3075, 20},
    {1800, 19},
    {-675, 18},
    {150, 17},
    {70, 16},
    {-340, 14},
    {510, 13},
    {-340, 12},
    {85, 11},
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
