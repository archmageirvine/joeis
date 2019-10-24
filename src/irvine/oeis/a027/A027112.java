package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027112 <code>a(n) = Sum{T(n,k)*T(n,k+3)}, 0&lt;=k&lt;=2n-3</code>, T given by <code>A027082</code>.
 * @author Sean A. Irvine
 */
public class A027112 extends A027082 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 3)));
    }
    return sum;
  }
}
