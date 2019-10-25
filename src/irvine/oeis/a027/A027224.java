package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026747;

/**
 * A027224 <code>a(n) = Sum{T(n,k)*T(n,k+1), 0&lt;=k&lt;=n-1</code>, T given by <code>A026747</code>.
 * @author Sean A. Irvine
 */
public class A027224 extends A026747 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
