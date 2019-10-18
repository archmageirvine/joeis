package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026943 <code>a(n) = Sum{(k+1)*T(n,k)}, 0&lt;=k&lt;=n</code>, T given by <code>A026300</code>.
 * @author Sean A. Irvine
 */
public class A026943 extends A026300 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(t(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
