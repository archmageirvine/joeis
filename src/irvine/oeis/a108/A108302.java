package irvine.oeis.a108;
// Generated by gen_seq4.pl 2024-11-13.ack/sintrif at 2024-11-13 22:27

import irvine.math.z.Z;
import irvine.oeis.a045.A045503;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A108302 Concatenate n and the sum of the digits of n raised to their own power (A045503).
 * @author Georg Fischer
 */
public class A108302 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A108302() {
    super(0, (term, n) -> new Z(Integer.toString(n) + term.toString()), "", new A045503());
  }
}
