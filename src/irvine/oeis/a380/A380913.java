package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005448;

/**
 * A380913 Squarefree semiprimes that are centered triangular numbers.
 * @author Georg Fischer
 */
public class A380913 extends FilterSequence {

  /** Construct the sequence. */
  public A380913() {
    super(1, new A005448(), v -> Predicates.SQUARE_FREE.is(v) && Predicates.SEMIPRIME.is(v));
  }
}
