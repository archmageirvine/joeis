package irvine.oeis.a342;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002796;

/**
 * A342855 Numbers that contain a digit 0 (A011540) and that are divisible by their nonzero digits (A002796).
 * @author Georg Fischer
 */
public class A342855 extends FilterSequence {

  /** Construct the sequence. */
  public A342855() {
    super(1, new A002796(), v -> Predicates.DIGIT_CONTAINS_ZERO.is(v));
  }
}
