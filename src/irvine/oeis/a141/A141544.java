package irvine.oeis.a141;
// Generated by gen_seq4.pl 2025-05-02.ack/filnum at 2025-05-02 12:03

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A141544 Odd numbers k such that 2k+5 is a prime.
 * @author Georg Fischer
 */
public class A141544 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A141544() {
    super(1, 0, k -> (k & 1) == 1 && Predicates.PRIME.is(2 * k + 5));
  }
}
