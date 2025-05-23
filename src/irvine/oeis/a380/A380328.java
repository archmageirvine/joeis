package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a174.A174973;

/**
 * A380328 2-dense squarefree numbers: Squarefree numbers whose divisors increase by factors of at most 2.
 * @author Georg Fischer
 */
public class A380328 extends FilterSequence {

  /** Construct the sequence. */
  public A380328() {
    super(1, new A174973(), v -> Predicates.SQUARE_FREE.is(v));
  }
}
