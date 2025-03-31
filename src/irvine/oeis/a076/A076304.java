package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a034.A034961;

/**
 * A076304 Numbers k such that k^2 is a sum of three successive primes.
 * @author Sean A. Irvine
 */
public class A076304 extends A034961 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      if (Predicates.SQUARE.is(s)) {
        return s.sqrt();
      }
    }
  }
}
