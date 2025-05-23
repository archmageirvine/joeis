package irvine.oeis.a086;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a065.A065300;

/**
 * A086368 Nonsquarefree numbers k such that sigma(k) is squarefree.
 * @author Georg Fischer
 */
public class A086368 extends FilterSequence {

  /** Construct the sequence. */
  public A086368() {
    super(1, new A065300(), v -> !Predicates.SQUARE_FREE.is(v));
  }
}
