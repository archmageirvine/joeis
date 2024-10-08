package irvine.oeis.a369;
// Generated by gen_seq4.pl 2024-08-16.ack/parity at 2024-08-16 19:15

import irvine.math.z.Z;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A369975 Parity of A369974.
 * @author Georg Fischer
 */
public class A369975 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A369975() {
    super(1, (term, n) -> term.testBit(0) ? Z.ONE : Z.ZERO, new A369974());
  }
}
