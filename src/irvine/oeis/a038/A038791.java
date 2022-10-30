package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A038791 An intermediate sequence for nonisomorphic circulant p^2-tournaments, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A038791 extends A065091 {

  {
    setOffset(2);
  }

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum = Z.ZERO;
    for (final Z rr : Jaguar.factor(p - 1).divisors()) {
      if (rr.isOdd()) {
        final int r = rr.intValue();
        sum = sum.add(Z.valueOf(LongUtils.phi(r)).shiftLeft((p - 1) / r));
      }
    }
    return sum.divide(p - 1);
  }
}
