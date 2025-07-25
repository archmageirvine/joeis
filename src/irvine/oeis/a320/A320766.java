package irvine.oeis.a320;
// Generated by gen_seq4.pl 2025-06-22.ack/multraf at 2025-06-22 22:11

import irvine.oeis.a276.A276929;
import irvine.oeis.a276.A276930;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A320766 Number of ordered set partitions of [n] where the maximal block size equals ten.
 * @author Georg Fischer
 */
public class A320766 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A320766() {
    super(10, (self, n) -> self.s(0).subtract(self.s(1)), "", new A276930(), new A276929());
  }
}
