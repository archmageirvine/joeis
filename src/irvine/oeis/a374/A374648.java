package irvine.oeis.a374;
// Generated by gen_seq4.pl 2024-07-31/sintrif at 2024-07-31 22:55

import irvine.oeis.DirectSequence;
import irvine.oeis.a081.A081125;
import irvine.oeis.a355.A355988;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A374648 a(n) = n! / (floor(n/3))! - n! / (floor(n/2))!.
 * @author Georg Fischer
 */
public class A374648 extends SingleTransformSequence {

  private static final DirectSequence A355988 = new A355988();

  /** Construct the sequence. */
  public A374648() {
    super(0, (term, n) -> A355988.a(n).subtract(term), "", new A081125());
  }
}
