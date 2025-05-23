package irvine.oeis.a316;
// Generated by gen_seq4.pl 2025-05-05.ack/filter at 2025-05-05 23:11

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a061.A061423;

/**
 * A316486 Squares whose arithmetic mean of digits is 6 (i.e., the sum of digits is 6 times the number of digits).
 * @author Georg Fischer
 */
public class A316486 extends FilterSequence {

  /** Construct the sequence. */
  public A316486() {
    super(1, new A061423(), v -> Predicates.SQUARE.is(v));
  }
}
