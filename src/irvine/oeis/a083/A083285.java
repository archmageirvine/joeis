package irvine.oeis.a083;
// Generated by gen_seq4.pl 2025-03-25.ack/filnum at 2025-03-26 22:32

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A083285 Numbers n such that n and n+4 are both brilliant numbers (A078972).
 * @author Georg Fischer
 */
public class A083285 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A083285() {
    super(1, 0, k -> Predicates.BRILLIANT.is(k) && Predicates.BRILLIANT.is(k + 4));
  }
}
