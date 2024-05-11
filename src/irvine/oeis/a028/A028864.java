package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A028864 Primes with digits in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A028864 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Predicates.DIGIT_NONDECREASAING.is(p)) {
        return p;
      }
    }
  }
}
