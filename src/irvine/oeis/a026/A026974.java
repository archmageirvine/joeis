package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026974 a(n) = Sum_{k=0..n-3} T(n,k) * T(n,k+3), with T given by A026648.
 * @author Sean A. Irvine
 */
public class A026974 extends A026648 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k - 3)));
    }
    return sum;
  }
}
