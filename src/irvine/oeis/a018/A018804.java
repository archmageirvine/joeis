package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A018804 Pillai's arithmetical function: Sum_{k=1..n} gcd(k, n).
 * @author Sean A. Irvine
 */
public class A018804 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Jaguar.factor(d).phi().multiply(n.divide(d)));
    }
    return sum;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Euler.phi(d).multiply(mN / d.longValue()));
    }
    return sum;
  }
}
