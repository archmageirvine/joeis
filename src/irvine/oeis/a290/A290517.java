package irvine.oeis.a290;
// Generated by gen_seq4.pl 2024-10-15.ack/multraf at 2024-10-15 22:29

import irvine.oeis.a000.A000142;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A290517 Maximum value of the multinomial coefficients M(n;lambda), where lambda ranges over all partitions of n into distinct parts.
 * @author Georg Fischer
 */
public class A290517 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A290517() {
    super(0, (self, n) -> self.s(0).divide(self.s(1)), "", new A000142(), new A290518());
  }
}
