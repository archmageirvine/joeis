package irvine.oeis.a255;
// Generated by gen_seq4.pl 2025-06-16.ack/sintrif at 2025-06-16 21:55

import irvine.math.q.Q;
import irvine.oeis.a191.A191161;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A255242 Calculate the aliquot parts of a number n and take their sum. Then repeat the process calculating the aliquot parts of all the previous aliquot parts and add their sum to the previous one. Repeat the process until the sum to be added is zero. Sequence lists these sums.
 * @author Georg Fischer
 */
public class A255242 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A255242() {
    super(1, (term, n) -> (new Q(term).subtract(n)).divide(2).num(), "", new A191161());
  }
}
