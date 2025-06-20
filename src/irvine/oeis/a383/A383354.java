package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-06-01.ack/sintrif at 2025-06-01 21:15

import irvine.oeis.a000.A000219;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A383354 Squares of plane partition numbers.
 * @author Georg Fischer
 */
public class A383354 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A383354() {
    super(0, (term, n) -> term.square(), "", new A000219());
  }
}
