package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084866 Primes that can be written in the form 2*p^2 + 3*q^2 with p and q prime.
 * @author Sean A. Irvine
 */
public class A084866 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long pp = p.longValueExact();
      for (long v = 2; 3 * v * v < pp; v = mPrime.nextPrime(v)) {
        final long t = pp - 3 * v * v;
        if ((t & 1) == 0 && Predicates.SQUARE.is(t / 2) && mPrime.isPrime(Functions.SQRT.l(t / 2))) {
          return p;
        }
      }
    }
  }
}
