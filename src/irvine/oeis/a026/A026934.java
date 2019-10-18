package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a008.A008288;

/**
 * A026934 <code>a(n) = Sum{T(n,k)*T(n,k+1)}, 0&lt;=k&lt;=n-1</code>, T given by <code>A008288</code>.
 * @author Sean A. Irvine
 */
public class A026934 extends A008288 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN - k , k).multiply(get(mN - k - 1, k + 1)));
    }
    return sum;
  }
}
