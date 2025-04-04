package irvine.oeis.a345;
// Generated by gen_seq4.pl 2024-11-19.ack/multraf at 2024-11-19 23:27

import irvine.oeis.a071.A071324;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A345062 a(n) = A071324(n) / gcd(A071324(n), A206369(n)).
 * @author Georg Fischer
 */
public class A345062 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A345062() {
    super(1, (self, n) -> self.s(0).divide(self.s(1)), "", new A071324(), new A345061());
  }
}
