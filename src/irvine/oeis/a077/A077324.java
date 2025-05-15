package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077324 Sum of terms of n-th row of A077321.
 * @author Sean A. Irvine
 */
public class A077324 extends A077321 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
