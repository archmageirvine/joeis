package irvine.oeis.a095;
// Generated by gen_seq4.pl 2024-07-27.ack/sintrif at 2024-07-27 22:17

import irvine.math.z.Z;
import irvine.oeis.a068.A068093;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A095865 Smallest n-digit triangular number - smallest n-digit number.
 * @author Georg Fischer
 */
public class A095865 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A095865() {
    super(1, (term, n) -> term.subtract(Z.TEN.pow(Z.valueOf(n - 1))), "", new A068093());
  }
}
