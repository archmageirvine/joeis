package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026955 <code>a(n) = Sum{(k+1)*T(n,k)}, 0&lt;=k&lt;=n</code>, T given by <code>A026386</code>.
 * @author Sean A. Irvine
 */
public class A026955 extends A026386 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
