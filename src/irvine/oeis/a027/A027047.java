package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027047 <code>a(n) = Sum{T(n,k)*T(n,k+1)}, 0&lt;=k&lt;=2n-1</code>, T given by <code>A027023</code>.
 * @author Sean A. Irvine
 */
public class A027047 extends A027023 {

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
