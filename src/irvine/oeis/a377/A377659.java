package irvine.oeis.a377;
// Generated by gen_seq4.pl 2025-02-03.ack/sintrif at 2025-02-03 18:14

import irvine.oeis.DirectSequence;
import irvine.oeis.a001.A001006;
import irvine.oeis.a011.A011782;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A377659 a(n) = Motzkin(n) - 2^(n - 1 + 0^n) = A001006(n) - A011782(n).
 * @author Georg Fischer
 */
public class A377659 extends SingleTransformSequence {

  private static final DirectSequence A011782 = new A011782();

  /** Construct the sequence. */
  public A377659() {
    super(0, (term, n) -> term.subtract(A011782.a(n)), "", new A001006());
  }
}
