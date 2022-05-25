package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057151 Number of square binary matrices with n ones, with no zero rows or columns, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A057151 extends A057150 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
