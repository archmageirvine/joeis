package irvine.oeis.a085;
// Generated by gen_seq4.pl 2025-04-08.ack/multrar at 2025-04-08 00:02

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A085060 Integer reached in A085058.
 * @author Georg Fischer
 */
public class A085060 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A085060() {
    super(0, (self, n) -> (n & 1) == 0 ? Z.valueOf(9 * n / 2 + 3) : self.a(n / 2).multiply(3).add(3), "");
  }
}
