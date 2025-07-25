package irvine.oeis.a135;
// Generated by gen_seq4.pl 2025-07-26.ack/sintrif at 2025-07-26 21:09

import irvine.math.function.Functions;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A135555 Prime sums of digits of the terms in A135554.
 * @author Georg Fischer
 */
public class A135555 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A135555() {
    super(1, (term, n) -> Functions.DIGIT_SUM.z(10, term), "", new A135554());
  }
}
