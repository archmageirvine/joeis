package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027136 <code>a(n) = Sum{T(n,k)*T(n,2n-k)}, 0&lt;=k&lt;=n-1</code>, T given by <code>A027113</code>.
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
