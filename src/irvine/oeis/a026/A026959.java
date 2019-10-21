package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026959 <code>a(n) = Sum_{k=0..n-3} T(n,k) * T(n,k+3)</code>, with T given by <code>A026615</code>.
 * @author Sean A. Irvine
 */
public class A026959 extends A026615 {

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
