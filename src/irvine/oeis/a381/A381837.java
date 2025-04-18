package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-28.ack/sintrif at 2025-03-28 22:47

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A381837 k/16 is in this list if A053737(k) &lt; A235127(k), i.e. if digitsum(k, 4) &lt; valuation(k, 4).
 * @author Georg Fischer
 */
public class A381837 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A381837() {
    super(1, (term, n) -> term.divide(16), "", new FilterNumberSequence(1, 1, k -> Functions.DIGIT_SUM.i(4, k) < Functions.VALUATION.i(k, 4)));
  }
}
