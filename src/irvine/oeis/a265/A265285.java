package irvine.oeis.a265;
// Generated by gen_seq4.pl 2025-03-23.ack/filnum at 2025-03-23 22:08

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A265285 Carmichael numbers (A002997) k such that k-1 is a square.
 * @author Georg Fischer
 */
public class A265285 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A265285() {
    super(1, 2, k -> Predicates.CARMICHAEL.is(k) && Predicates.SQUARE.is(k - 1));
  }
}
