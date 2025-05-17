package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077360 Primes whose external digits as well as internal digits form a prime.
 * @author Sean A. Irvine
 */
public class A077360 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String t = p.toString();
      if (t.length() >= 3 && Predicates.PRIME.is((t.charAt(0) - '0') * 10 + t.charAt(t.length() - 1) - '0') && new Z(t.substring(1, t.length() - 1)).isProbablePrime()) {
        return p;
      }
    }
  }
}
