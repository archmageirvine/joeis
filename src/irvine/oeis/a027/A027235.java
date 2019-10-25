package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026758;

/**
 * A027235 <code>a(n) = Sum{(k+1)*T(n,k), 0&lt;=k&lt;=n</code>, T given by <code>A026758</code>.
 * @author Sean A. Irvine
 */
public class A027235 extends A026758 {

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
