package irvine.oeis.a212;
// Generated by gen_seq4.pl 2024-10-15.ack/multraf at 2024-10-15 22:29

import irvine.oeis.a000.A000142;
import irvine.oeis.a060.A060828;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A212307 Numerator of n!/3^n.
 * @author Georg Fischer
 */
public class A212307 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A212307() {
    super(0, (self, n) -> self.s(0).divide(self.s(1)), "", new A000142(), new A060828());
  }
}
