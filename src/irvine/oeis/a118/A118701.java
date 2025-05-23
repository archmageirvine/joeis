package irvine.oeis.a118;
// Generated by gen_seq4.pl 2025-04-20.ack/sintrif at 2025-04-20 22:06

import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014574;
import irvine.oeis.a034.A034699;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A118701 Largest prime power that divides the average of twin-prime pairs.
 * @author Georg Fischer
 */
public class A118701 extends SingleTransformSequence {

  private static final DirectSequence A034699 = new A034699();

  /** Construct the sequence. */
  public A118701() {
    super(1, (term, n) -> A034699.a(term), "", new A014574());
  }
}
