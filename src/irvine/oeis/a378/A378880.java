package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-06-16.ack/multraf at 2025-06-16 21:55

import irvine.oeis.a083.A083025;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A378880 a(n) = A378879(n) - A083025(n).
 * @author Georg Fischer
 */
public class A378880 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A378880() {
    super(1, (self, n) -> self.s(0).subtract(self.s(1)), "", new A378879(), new A083025());
  }
}
