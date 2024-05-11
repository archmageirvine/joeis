package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A028865 Primes that when squared gives numbers with digits in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A028865 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Predicates.DIGIT_NONDECREASAING.is(p.square())) {
        return p;
      }
    }
  }
}
