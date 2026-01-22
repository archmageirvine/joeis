package irvine.oeis.a392;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392186 Semiprimes k such that k+2 and k+6 are primes and k+4 and k+8 are all semiprimes.
 * @author Sean A. Irvine
 */
public class A392186 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.add(4).isProbablePrime() && Predicates.SEMIPRIME.is(p.subtract(2)) && Predicates.SEMIPRIME.is(p.add(2)) && Predicates.SEMIPRIME.is(p.add(6))) {
        return p.subtract(2);
      }
    }
  }
}
