package irvine.oeis.a063;

import irvine.math.predicate.Predicates;
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
      if (Predicates.SEMIPRIME.is(p.add(2)) && Predicates.SEMIPRIME.is(p.subtract(2))) {
        return p;
      }
    }
  }
}
