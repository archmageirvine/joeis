package irvine.oeis.a273;
// Generated by gen_seq4.pl 2025-04-04.ack/multraf at 2025-04-04 23:53

import irvine.oeis.a001.A001235;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A273555 a(n) = A001235(n) - floor(A001235(n)^(1/3))^3.
 * @author Georg Fischer
 */
public class A273555 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A273555() {
    super(1, (self, n) -> self.s(0).subtract(self.s(0).root(3).pow(3)), "", new A001235());
  }
}
