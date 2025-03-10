package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-12-15.ack/multrar at 2024-12-15 23:09

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A351813 G.f. A(x) satisfies: A(x) = 1 + x * A(x/(1 - x)^3) / (1 - x).
 * @author Georg Fischer
 */
public class A351813 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A351813() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n + 2L * k - 1, n - k - 1).multiply(self.a(k))), "1");
  }
}
