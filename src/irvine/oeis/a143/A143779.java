package irvine.oeis.a143;
// Generated by gen_seq4.pl 2025-03-26.ack/multrar at 2025-03-26 22:40

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A143779 Numbers of the form k=k^2-n^2.
 * @author Georg Fischer
 */
public class A143779 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A143779() {
    super(1, (self, n) -> self.a(n - 1).square().subtract(Z.valueOf(n - 1).square()), "0");
  }
}
