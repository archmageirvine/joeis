package irvine.oeis.a084;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a018.A018825;

/**
 * A084349 Squarefree numbers that are not the sum of two squares.
 * @author Georg Fischer
 */
public class A084349 extends FilterSequence {

  /** Construct the sequence. */
  public A084349() {
    super(1, new A018825(), v -> Predicates.SQUARE_FREE.is(v));
  }
}
