package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026725;

/**
 * A027210 <code>a(n) = Sum{T(n,k)*T(n,k+3), 1&lt;=k&lt;=n-3</code>, T given by <code>A026725</code>.
 * @author Sean A. Irvine
 */
public class A027210 extends A026725 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 3)));
    }
    return sum;
  }
}
