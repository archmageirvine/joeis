package irvine.oeis.a141;
// Generated by gen_seq4.pl 2024-05-17/multraf at 2024-05-17 23:03

import irvine.oeis.a000.A000005;
import irvine.oeis.a000.A000065;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A141668 a(n) = tau(n) * (NumberOfPartitions(n) - 1).
 * @author Georg Fischer
 */
public class A141668 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A141668() {
    super(0, (self, n) -> self.s(0).multiply(self.s(1)), "", new A000005(), new A000065());
  }
}
