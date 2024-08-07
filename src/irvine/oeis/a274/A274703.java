package irvine.oeis.a274;
// Generated by gen_seq4.pl 2024-07-11/multrar at 2024-07-11 18:00

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A274703 Exponential generating function 1/M_{3}(z^3) where M_{n}(z) is the n-th Mittag-Leffler function, nonzero coefficients only.
 * @author Georg Fischer
 */
public class A274703 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A274703() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> self.a(k).multiply(Binomial.binomial(3L * n + 1, 3L * k + 1))).negate(), "1");
  }
}
