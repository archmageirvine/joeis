package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051364 Number of 5-element families of an n-element set such that every 3 members of the family have a nonempty intersection.
 * @author Sean A. Irvine
 */
public class A051364 implements Sequence {

  private static final int[][] C = {
    {1, 32},
    {-10, 28},
    {30, 26},
    {5, 25},
    {-80, 24},
    {45, 23},
    {105, 22},
    {-217, 21},
    {205, 20},
    {-120, 19},
    {45, 18},
    {-10, 17},
    {-9, 16},
    {40, 14},
    {-60, 13},
    {40, 12},
    {-10, 11},
    {35, 8},
    {-35, 7},
    {-50, 4},
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
