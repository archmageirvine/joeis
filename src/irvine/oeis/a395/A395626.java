package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A395626 Numbers x*y such that |x-y| is a square, with nonnegative integers x and y.
 * @author Sean A. Irvine
 */
public class A395626 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395626() {
    super(1, 0, k -> {
      if (k == 0) {
        return true;
      }
      for (final Z dd : Jaguar.factor(k).divisors()) {
        final long d = dd.longValue();
        if (d * d <= k && Predicates.SQUARE.is(k / d - d)) {
          return true;
        }
      }
      return false;
    });
  }
}

