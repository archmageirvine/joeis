package irvine.oeis.a110;
// Generated by gen_seq4.pl 2025-03-23.ack/filnum at 2025-03-23 22:08

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A110599 Balanced numbers n such that n mod 12 = 7.
 * @author Georg Fischer
 */
public class A110599 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A110599() {
    super(1, 1, k -> k % 12 == 7 && Predicates.BALANCED.is(k));
  }
}
