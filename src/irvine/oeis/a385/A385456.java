package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-03.ack/sintrif at 2025-07-03 22:12

import irvine.math.z.Z;
import irvine.oeis.a010.A010048;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A385456 Triangle read by rows, formed by reading Fibonomial coefficients (A010048) mod 2.
 * @author Georg Fischer
 */
public class A385456 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A385456() {
    super(0, (term, n) -> term.and(Z.ONE), "", new A010048());
  }
}
