package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-15.ack/multia at 2025-07-15 23:51

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A385946 a(0) = 1; a(n) = Sum_{k=0..n-1} binomial(k+4,4) * binomial(n-1,k) * a(k) * a(n-1-k).
 * @author Georg Fischer
 */
public class A385946 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A385946() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(k + 4, 4).multiply(Binomial.binomial(n - 1, k)).multiply(self.a(k)).multiply(self.a(n - 1 - k))), "1");
  }
}
