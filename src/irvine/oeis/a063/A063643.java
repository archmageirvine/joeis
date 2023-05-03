package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063643 Primes with 2 representations: p*q - 2 = u*v + 2 where p, q, u and v are primes.
 * @author Sean A. Irvine
 */
public class A063643 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final int semiprime = Jaguar.factor(p.add(2)).isSemiprime();
      if (semiprime == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException("Could not determine status of " + p);
      }
      if (semiprime == FactorSequence.YES) {
        final int s2 = Jaguar.factor(p.subtract(2)).isSemiprime();
        if (s2 == FactorSequence.UNKNOWN) {
          throw new UnsupportedOperationException("Could not determine status of " + p);
        }
        if (s2 == FactorSequence.YES) {
          return p;
        }
      }
    }
  }
}
