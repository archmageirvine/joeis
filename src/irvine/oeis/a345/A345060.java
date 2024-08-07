package irvine.oeis.a345;
// Generated by gen_seq4.pl 2024-07-20/sintrif at 2024-07-20 00:09

import irvine.oeis.DirectSequence;
import irvine.oeis.a071.A071324;
import irvine.oeis.a206.A206369;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A345060 a(n) = A071324(n) - A206369(n).
 * @author Georg Fischer
 */
public class A345060 extends SingleTransformSequence {

  private static final DirectSequence A206369 = new A206369();

  /** Construct the sequence. */
  public A345060() {
    super(1, (term, n) -> term.subtract(A206369.a(n)), "", new A071324());
  }
}
