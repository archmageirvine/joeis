package irvine.oeis.a117;
// Generated by gen_seq4.pl 2024-03-26/filtpos at 2024-03-26 23:22

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a051.A051953;

/**
 * A117284 Numbers k for which the cototient k-phi(k) is a triangular number.
 * @author Georg Fischer
 */
public class A117284 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A117284() {
    super(1, 1, new A051953(), v -> Predicates.POLYGONAL.is(3, v));
  }
}
