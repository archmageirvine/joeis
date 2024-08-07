package irvine.oeis.a357;
// Generated by gen_seq4.pl 2024-07-24.ack/multraf at 2024-07-24 22:30

import irvine.oeis.a005.A005258;
import irvine.oeis.a005.A005259;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A357957 a(n) = A005259(n)^5 - A005258(n)^2.
 * @author Georg Fischer
 */
public class A357957 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A357957() {
    super(0, (self, n) -> self.s(0).pow(5).subtract(self.s(1).square()), "", new A005259(), new A005258());
  }
}
