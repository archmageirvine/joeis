package irvine.oeis.a052;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052042 Primes that lack the digit zero in the decimal expansion of their squares.
 * @author Sean A. Irvine
 */
public class A052042 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!Predicates.DIGIT_CONTAINS_ZERO.is(p.square())) {
        return p;
      }
    }
  }
}

