package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-26.ack/sintrif at 2025-03-26 22:40

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A381834 k/16 is in this list if k &gt; 4 and A053737(k) = A235127(k), i.e. if digitsum(k, 4) = valuation(k, 4).
 * @author Georg Fischer
 */
public class A381834 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A381834() {
    super(1, (term, n) -> term.divide(16), "", new FilterNumberSequence(0, 1, k -> Functions.DIGIT_SUM.i(4, k) == Functions.VALUATION.i(k, 4)));
  }
}
