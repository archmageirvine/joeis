package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027142 <code>a(n) = Sum{T(n,k)*T(n,k+2)}, 0&lt;=k&lt;=2n-2</code>, T given by <code>A027113</code>.
 * @author Sean A. Irvine
 */
public class A027142 extends A027113 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN - 1; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 2)));
    }
    return sum;
  }
}
