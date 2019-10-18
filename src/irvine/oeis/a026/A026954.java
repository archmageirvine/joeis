package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026954 <code>a(n) = Sum{T(n,k)*T(n,k+3)}, 0&lt;=k&lt;=n-3</code>, T given by <code>A026386</code>.
 * @author Sean A. Irvine
 */
public class A026954 extends A026386 {

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
