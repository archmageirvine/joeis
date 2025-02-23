package irvine.oeis.a138;
// Generated by gen_seq4.pl 2024-10-10.ack/sintrif at 2024-10-10 21:17

import irvine.math.z.Z;
import irvine.oeis.a000.A000043;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A138871 Last 3 digits of n-th even superperfect number A061652(n).
 * @author Georg Fischer
 */
public class A138871 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A138871() {
    super(1, (term, n) -> Z.TWO.pow(term.subtract(1)).mod(Z.valueOf(1000)), "", new A000043());
  }
}
