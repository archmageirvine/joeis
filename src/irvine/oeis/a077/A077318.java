package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077318 Sum of terms in n-th row of A077316.
 * @author Sean A. Irvine
 */
public class A077318 extends A077316 {

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
