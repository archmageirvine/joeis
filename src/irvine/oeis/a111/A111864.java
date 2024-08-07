package irvine.oeis.a111;
// Generated by gen_seq4.pl 2024-07-12/sintrif at 2024-07-12 23:14

import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000213;
import irvine.oeis.a002.A002275;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A111864 Define the first three terms to be 1, 1 and 1. All the other terms are obtained by concatenating the three previous terms.
 * @author Georg Fischer
 */
public class A111864 extends SingleTransformSequence {

  private static final DirectSequence A002275 = new A002275();

  /** Construct the sequence. */
  public A111864() {
    super(0, (term, n) -> A002275.a(term), "", new A000213());
  }
}
