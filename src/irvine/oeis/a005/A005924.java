package irvine.oeis.a005;
// Generated by gen_seq4.pl 2024-07-26/sintrif at 2024-07-27 00:11

import irvine.oeis.a000.A000557;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A005924 From solution to a difference equation.
 * @author Georg Fischer
 */
public class A005924 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A005924() {
    super(1, (term, n) -> term.subtract(1), "", new A000557());
  }
}
