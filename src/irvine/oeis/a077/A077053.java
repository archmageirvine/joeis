package irvine.oeis.a077;
// Generated by gen_seq4.pl 2025-03-28.ack/multraf at 2025-03-28 22:47

import irvine.oeis.a075.A075768;
import irvine.oeis.a075.A075769;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A077053 Greatest common divisor of indecomposable Wallis pairs.
 * @author Georg Fischer
 */
public class A077053 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A077053() {
    super(1, (self, n) -> self.s(0).gcd(self.s(1)), "", new A075768(), new A075769());
  }
}
