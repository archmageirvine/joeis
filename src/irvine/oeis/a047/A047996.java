package irvine.oeis.a047;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047996 Triangle read by rows: T(n,k) is the (n,k)-th circular binomial coefficient, where 0 &lt;= k &lt;= n.
 *
 * @author Sean A. Irvine
 */
public class A047996 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(LongUtils.gcd(mN, mM)).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.binomial(mN / d, mM / d).multiply(Euler.phi(dd)));
    }
    return sum.divide(mN);
  }
}
