package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a008.A008288;

/**
 * A026935 <code>a(n) = Sum_{k=0..n-2} T(n,k) * T(n,k+2)</code>, with T given by <code>A008288</code>.
 * @author Sean A. Irvine
 */
public class A026935 extends A008288 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 1; ++k) {
      sum = sum.add(get(mN - k , k).multiply(get(mN - k - 2, k + 2)));
    }
    return sum;
  }
}
