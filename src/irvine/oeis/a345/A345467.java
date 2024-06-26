package irvine.oeis.a345;
// Generated by gen_seq4.pl 2024-06-24/sintrif at 2024-06-24 23:40

import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002275;
import irvine.oeis.a014.A014950;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A345467 Ratios R(k)/k for which R(k) / k is an integer, where R(k) = A002275(k) is a repunit.
 * @author Georg Fischer
 */
public class A345467 extends SingleTransformSequence {

  private static final DirectSequence A002275 = new A002275();

  /** Construct the sequence. */
  public A345467() {
    super(1, (term, n) -> A002275.a(term).divide(term), "", new A014950());
  }
}
