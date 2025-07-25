package irvine.oeis.a130;
// Generated by gen_seq4.pl 2025-07-03.ack/sintrif at 2025-07-03 22:12

import irvine.math.z.Z;
import irvine.oeis.a034.A034868;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A130047 Left half of Pascal's triangle (A034868) modulo 2.
 * @author Georg Fischer
 */
public class A130047 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A130047() {
    super(0, (term, n) -> term.and(Z.ONE), "", new A034868());
  }
}
