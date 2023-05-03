package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063638 Primes p such that p-2 is a semiprime.
 * @author Sean A. Irvine
 */
public class A063638 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final int semiprime = Jaguar.factor(p.subtract(2)).isSemiprime();
      if (semiprime == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException("Could not determine status of " + p);
      }
      if (semiprime == FactorSequence.YES) {
        return p;
      }
    }
  }
}
