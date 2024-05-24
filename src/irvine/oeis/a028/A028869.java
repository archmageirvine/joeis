package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A028869 Squares of primes with digits in nonascending order.
 * @author Sean A. Irvine
 */
public class A028869 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next().square();
      if (Predicates.DIGIT_NONINCREASING.is(p)) {
        return p;
      }
    }
  }
}
