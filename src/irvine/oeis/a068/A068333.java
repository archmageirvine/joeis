package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068333 Product(n/k - k) where the product is over the divisors k of n and where 1 &lt;= k &lt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A068333 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      if (d * d <= mN) {
        prod = prod.multiply(mN / d - d);
      }
    }
    return prod;
  }
}
