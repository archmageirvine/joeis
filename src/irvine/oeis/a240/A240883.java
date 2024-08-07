package irvine.oeis.a240;
// Generated by gen_seq4.pl 2024-07-20/sintrif at 2024-07-20 00:09

import irvine.oeis.a046.A046818;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A240883 Central terms of the triangle in A240857.
 * @author Georg Fischer
 */
public class A240883 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A240883() {
    super(0, (term, n) -> term.subtract(1), "", new A046818());
  }
}
