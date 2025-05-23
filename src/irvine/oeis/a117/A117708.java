package irvine.oeis.a117;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000959;

/**
 * A117708 Numbers that are both lucky numbers and Chen primes.
 * @author Georg Fischer
 */
public class A117708 extends FilterSequence {

  /** Construct the sequence. */
  public A117708() {
    super(1, new A000959(), v -> Predicates.CHEN_PRIME.is(v));
  }
}
