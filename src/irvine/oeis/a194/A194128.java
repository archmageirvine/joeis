package irvine.oeis.a194;
// Generated by gen_seq4.pl 2025-04-22.ack/filter at 2025-04-22 22:21

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a173.A173143;

/**
 * A194128 (Partial sums of the squarefree integers) that are prime.
 * @author Georg Fischer
 */
public class A194128 extends FilterSequence {

  /** Construct the sequence. */
  public A194128() {
    super(1, new A173143(), v -> Predicates.PRIME.is(v));
  }
}
