package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A028868 Primes that when squared give numbers with digits in nonascending order.
 * @author Sean A. Irvine
 */
public class A028868 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Predicates.DIGIT_NONINCREASAING.is(p.square())) {
        return p;
      }
    }
  }
}
