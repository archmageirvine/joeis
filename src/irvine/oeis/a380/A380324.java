package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-07-11.ack/sintrif at 2025-07-11 21:53

import irvine.oeis.DirectSequence;
import irvine.oeis.a035.A035316;
import irvine.oeis.a268.A268335;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A380324 The sum of the squares dividing the n-th exponentially odd number.
 * @author Georg Fischer
 */
public class A380324 extends SingleTransformSequence {

  private static final DirectSequence A035316 = new A035316();

  /** Construct the sequence. */
  public A380324() {
    super(1, (term, n) -> A035316.a(term), "", new A268335());
  }
}
