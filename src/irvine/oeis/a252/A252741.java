package irvine.oeis.a252;
// Generated by gen_seq4.pl 2024-10-15.ack/multraf at 2024-10-15 22:29

import irvine.oeis.a000.A000142;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A252741 a(n) = A252738(n) / n!.
 * @author Georg Fischer
 */
public class A252741 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A252741() {
    super(0, (self, n) -> self.s(0).divide(self.s(1)), "", new A252738(), new A000142());
  }
}
