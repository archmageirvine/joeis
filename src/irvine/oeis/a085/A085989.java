package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A085989 Numbers that can be expressed as a sum of two squares, each &gt;=2.
 * @author Sean A. Irvine
 */
public class A085989 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085989() {
    super(1, k -> {
      for (long j = 2; 2 * j * j <= k; ++j) {
        if (Predicates.SQUARE.is(k - j * j)) {
          return true;
        }
      }
      return false;
    });
  }
}
