package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025227 a(n) = a(1)*a(n-1) + a(2)*a(n-2) + ... + a(n-1)*a(1) for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A025227 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    if (++mN > 0) {
      for (long k = 0; k <= mN / 2; ++k) {
        sum = sum.add(Binomial.catalan(mN - k - 1).multiply(Binomial.binomial(mN - k, k)));
      }
    }
    return sum;
  }
}
