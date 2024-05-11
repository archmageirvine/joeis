package irvine.oeis.a052;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A052041 Squares lacking the digit zero in their decimal expansion.
 * @author Sean A. Irvine
 */
public class A052041 extends A000290 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      if (!Predicates.DIGIT_CONTAINS_ZERO.is(square)) {
        return square;
      }
    }
  }
}

