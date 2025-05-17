package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077359 Primes whose external digits form a prime. Or primes from which deleting the internal digits leaves a prime.
 * @author Sean A. Irvine
 */
public class A077359 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String t = p.toString();
      if (t.length() < 3 || Predicates.PRIME.is((t.charAt(0) - '0') * 10 + t.charAt(t.length() - 1) - '0')) {
        return p;
      }
    }
  }
}
