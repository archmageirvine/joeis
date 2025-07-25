package irvine.oeis.a249;
// Generated by gen_seq4.pl 2025-07-11.ack/multia at 2025-07-11 21:53

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A249641 Number of strings of length n over an 8-letter alphabet that begin with a nontrivial palindrome.
 * @author Georg Fischer
 */
public class A249641 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A249641() {
    super(0, (self, n) -> {
      final int c = (n & 1) != 0 ? n / 2 + 1 : n / 2;
      return self.a(n - 1).multiply(8).add(Z.EIGHT.pow(c)).subtract(self.a(c));
    }, "0,0");
  }
}
