package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028576 a(n) = (1/(4*n)) * Sum_{d|n} mu(n/d) * binomial(2*d, d)^2.
 * @author Sean A. Irvine
 */
public class A028576 implements Sequence {

  private long mN = 0;
  
  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final long d = dd.longValue();
      final int m = Mobius.mobius(mN / d);
      if (m != 0) {
        sum = sum.signedAdd(m > 0, Binomial.binomial(2 * d, d).square());
      }
    }
    return sum.divide(4 * mN);
  }
}
