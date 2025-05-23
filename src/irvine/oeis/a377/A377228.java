package irvine.oeis.a377;
// Generated by gen_seq4.pl 2025-05-08.ack/filter at 2025-05-08 13:52

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005349;

/**
 * A377228 Repdigits which are also Harshad numbers.
 * @author Georg Fischer
 */
public class A377228 extends FilterSequence {

  /** Construct the sequence. */
  public A377228() {
    super(1, new A005349(), v -> Predicates.REPDIGIT.is(10, v));
  }
}
