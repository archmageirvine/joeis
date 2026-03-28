package irvine.oeis.a394;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A394358 Integers k such that 8*k^2 + m*k is a pronic number (A002378) for some m in {-6, -2, 2, 6}.
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
