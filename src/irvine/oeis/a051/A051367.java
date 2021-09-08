package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051367 Number of 5-element families of an n-element set such that every 4 members of the family have a nonempty intersection.
 * @author Sean A. Irvine
 */
public class A051367 implements Sequence {

  private static final int[][] C = {
    {1, 32},
    {-5, 30},
    {10, 29},
    {-10, 28},
    {5, 27},
    {-1, 26},
    {-10, 16},
    {10, 15},
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
