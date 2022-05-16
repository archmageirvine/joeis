package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029807 a(n) = (1/(8*n)) * Sum_{d|n} mu(n/d) * binomial(2*d,d)^3.
 * @author Sean A. Irvine
 */
public class A029807 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.binomial(2 * d, d).pow(3).multiply(Mobius.mobius(mN / d)));
    }
    return sum.shiftRight(3).divide(mN);
  }
}
