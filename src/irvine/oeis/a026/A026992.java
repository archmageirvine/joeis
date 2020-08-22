package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026992 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1), with T given by A026692.
 * @author Sean A. Irvine
 */
public class A026992 extends A026692 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k - 1)));
    }
    return sum;
  }
}
