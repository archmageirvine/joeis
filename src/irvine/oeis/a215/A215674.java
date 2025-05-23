package irvine.oeis.a215;
// Generated by gen_seq4.pl 2025-04-08.ack/multrar at 2025-04-08 00:02

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A215674 a(1) = 1, a(n) = 2 if 1&lt;n&lt;=3, a(3n) = a(n)+1, a(3n+1) = a(3n+2) = a(n)+a(n+1)+1 otherwise.
 * @author Georg Fischer
 */
public class A215674 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A215674() {
    super(1, (self, n) -> n % 3 == 0 ? self.a(n / 3).add(1) : self.a(n / 3).add(self.a(n / 3 + 1)).add(1), "1, 2, 2");
  }
}
