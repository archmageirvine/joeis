package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-12-15.ack/multrar at 2024-12-15 23:09

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A354696 G.f. A(x) satisfies: A(x) = 1 + x * A(x^4/(1 - x)^4) / (1 - x)^4.
 * @author Georg Fischer
 */
public class A354696 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A354696() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, (n - 1) / 4, k -> Binomial.binomial(n + 2, 4L * k + 3).multiply(self.a(k))), "1");
  }
}
