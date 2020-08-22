package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026568;

/**
 * A027277 a(n) = Sum_{k=0..n} binomial(2*k,k)*binomial(2*n-k,k).
 * @author Sean A. Irvine
 */
public class A027277 extends A026568 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, 2 * mN - k)));
    }
    return sum;
  }
}
