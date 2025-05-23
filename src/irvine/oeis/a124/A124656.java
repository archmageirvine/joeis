package irvine.oeis.a124;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000069;

/**
 * A124656 Abundant odious numbers. (Abundant numbers that have an odd number of ones in their binary representation.).
 * @author Georg Fischer
 */
public class A124656 extends FilterSequence {

  /** Construct the sequence. */
  public A124656() {
    super(1, new A000069(), v -> Predicates.ABUNDANT.is(v));
  }
}
