package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-11-10.ack/multraf at 2024-11-10 23:25

import irvine.oeis.a000.A000961;
import irvine.oeis.a001.A001597;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A377043 The n-th perfect-power A001597(n) minus the n-th power of a prime A000961(n).
 * @author Georg Fischer
 */
public class A377043 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A377043() {
    super(1, (self, n) -> self.s(0).subtract(self.s(1)), "", new A001597(), new A000961());
  }
}
