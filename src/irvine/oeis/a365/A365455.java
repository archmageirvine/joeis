package irvine.oeis.a365;
// Generated by gen_seq4.pl 2024-10-15.ack/multraf at 2024-10-15 22:29

import irvine.oeis.a000.A000203;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A365455 a(n) = sigma(n) / gcd(sigma(n), A156552(2*n)).
 * @author Georg Fischer
 */
public class A365455 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A365455() {
    super(1, (self, n) -> self.s(0).divide(self.s(1)), "", new A000203(), new A365454());
  }
}
