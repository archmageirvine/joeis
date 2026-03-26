package irvine.oeis.a394;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A394358 allocated for Mecibah Mohammed.
 * @author Sean A. Irvine
 */
public class A394358 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394358() {
    super(1, 0, n -> {
      for (long k = -6; k <= 6; k += 4) {
        if (Predicates.SQUARE.is(Z.valueOf(n).square().multiply(32).add(4 * k * n + 1))) {
          return true;
        }
      }
      return false;
    });
  }
}
