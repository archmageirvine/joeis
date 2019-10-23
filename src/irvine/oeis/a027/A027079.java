package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027079 <code>a(n) = Sum{T(n,k)*T(n,k+1)}, 0&lt;=k&lt;=2n-1</code>, T given by <code>A027052</code>.
 * @author Sean A. Irvine
 */
public class A027079 extends A027052 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
