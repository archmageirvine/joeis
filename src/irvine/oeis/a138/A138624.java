package irvine.oeis.a138;
// Generated by gen_seq4.pl 2025-06-03.ack/filnum at 2025-06-03 20:14

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A138624 Nonnegative integers k such that 17*k+5 is prime.
 * @author Georg Fischer
 */
public class A138624 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A138624() {
    super(1, 0, k -> Predicates.PRIME.is(17 * k + 5));
  }
}
