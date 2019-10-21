package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026993 <code>a(n) = Sum{T(n,k)*T(n,k+2)}, 0&lt;=k&lt;=n-2</code>, T given by <code>A026692</code>.
 * @author Sean A. Irvine
 */
public class A026993 extends A026692 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 1; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k - 2)));
    }
    return sum;
  }
}
