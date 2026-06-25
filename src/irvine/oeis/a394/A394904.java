package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A394904 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A394904 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394904() {
    super(1, 0, k -> {
      for (final Z dd : Jaguar.factor(k).divisors()) {
        final long d = dd.longValue();
        if (Predicates.SQUARE.is(k / d - d) || Predicates.SQUARE.is(k / d + d)) {
          return true;
        }
      }
      return false;
    });
  }
}
