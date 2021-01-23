package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027136 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,2n-k), with T given by A027113.
 * @author Sean A. Irvine
 */
public class A027136 extends A027113 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, 2 * mN - k)));
    }
    return sum;
  }
}
