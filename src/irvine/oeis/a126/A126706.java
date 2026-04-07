package irvine.oeis.a126;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A126706 Positive integers which are neither squarefree integers nor prime powers.
 * @author Sean A. Irvine
 */
public class A126706 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A126706() {
    super(1, k -> !Predicates.SQUARE_FREE.is(k) && !Predicates.PRIME_POWER.is(k));
  }
}
