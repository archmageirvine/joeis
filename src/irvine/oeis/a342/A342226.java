package irvine.oeis.a342;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a066.A066310;

/**
 * A342226 Numbers k with digits in nondecreasing order and satisfying k &lt; (product of digits of k) * (sum of digits of k).
 * @author Georg Fischer
 */
public class A342226 extends FilterSequence {

  /** Construct the sequence. */
  public A342226() {
    super(1, new A066310(), v -> Predicates.DIGIT_NONDECREASING.is(v));
  }
}
