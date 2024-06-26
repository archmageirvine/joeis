package irvine.oeis.a342;
// Generated by gen_seq4.pl 2024-05-24/dirtraf at 2024-05-24 21:50

import irvine.oeis.a008.A008683;
import irvine.oeis.a156.A156552;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A342653 a(n) = mu(A156552(n)), where mu is M\u00f6bius mu function.
 * @author Georg Fischer
 */
public class A342653 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A342653() {
    super(2, new A008683(), new A156552());
  }
}
