package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051305 Number of 5-element proper antichains of an n-element set.
 * @author Sean A. Irvine
 */
public class A051305 extends Sequence0 {

  private static final int[][] C = {
    {1, 32},
    {-30, 24},
    {150, 20},
    {-45, 18},
    {85, 17},
    {-515, 16},
    {-450, 15},
    {1365, 14},
    {390, 13},
    {-1680, 12},
    {-22, 11},
    {1875, 10},
    {-1080, 9},
    {-685, 8},
    {980, 7},
    {-669, 6},
    {575, 5},
    {-195, 4},
    {-150, 3},
    {124, 2},
    {-24, 1}
  };

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final int[] c : C) {
      sum = sum.add(Z.valueOf(c[1]).pow(mN).multiply(c[0]));
    }
    return sum.divide(120);
  }
}
