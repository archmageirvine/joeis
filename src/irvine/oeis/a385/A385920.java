package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-13.ack/multia at 2025-07-13 21:23

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A385920 E.g.f. A(x) satisfies A(x) = exp(x*A(x) + x^3*A''(x)).
 * @author Georg Fischer
 */
public class A385920 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A385920() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n - 1, k).multiply(self.a(k)).multiply(self.a(n - 1 - k)).multiply(Z.ONE.add(Z.valueOf(k).pow(3)))), "1");
  }
}
