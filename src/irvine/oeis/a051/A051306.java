package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051306 Number of 6-element proper antichains of an n-element set.
 * @author Sean A. Irvine
 */
public class A051306 implements Sequence {

  private static final int[][] C = {
    {1, 64},
    {-45, 48},
    {300, 40},
    {-135, 36},
    {510, 34},
    {-198, 33},
    {-1499, 32},
    {-2700, 30},
    {6615, 28},
    {1215, 27},
    {-780, 26},
    {3750, 25},
    {-6750, 24},
    {-8280, 23},
    {3828, 22},
    {-12285, 21},
    {19425, 20},
    {31635, 19},
    {-30105, 18},
    {-34425, 17},
    {24770, 16},
    {13125, 15},
    {-3885, 14},
    {390, 13},
    {-5670, 12},
    {-12485, 11},
    {28575, 10},
    {-16560, 9},
    {-3435, 8},
    {7868, 7},
    {-4995, 6},
    {3800, 5},
    {-1301, 4},
    {-822, 3},
    {668, 2},
    {-120, 1}
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
