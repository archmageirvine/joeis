package irvine.oeis.a274;
// Generated by gen_seq4.pl 2025-05-07.ack/filter at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a062.A062996;

/**
 * A274125 Numbers having digits in nondecreasing order and sum of digits greater than or equal to the product of digits.
 * @author Georg Fischer
 */
public class A274125 extends FilterSequence {

  /** Construct the sequence. */
  public A274125() {
    super(1, new A062996(), v -> Predicates.DIGIT_NONDECREASING.is(v));
  }
}
