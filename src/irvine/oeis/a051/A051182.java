package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051182 Number of 5-element intersecting families of an n-element set.
 * @author Sean A. Irvine
 */
public class A051182 implements Sequence {

  private static final int[][] C = {
    {1, 32},
    {-10, 24},
    {30, 20},
    {-5, 18},
    {5, 17},
    {-80, 16},
    {-30, 15},
    {135, 14},
    {30, 13},
    {-80, 12},
    {-2, 11},
    {10, 10},
    {-100, 9},
    {240, 8},
    {-160, 7},
    {-44, 6},
    {95, 5},
    {-85, 4},
    {50, 3},
    {24, 2},
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
