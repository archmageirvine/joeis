package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027074 <code>Sum{T(n,k)*T(n,2n-k)}, 0&lt;=k&lt;=n-1</code>, T given by <code>A027052</code>.
 * @author Sean A. Irvine
 */
public class A027074 extends A027052 {

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
