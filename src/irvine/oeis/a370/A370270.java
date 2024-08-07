package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-02-18/lambdan at 2024-02-18 22:59

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A370270 Coefficient of x^n in the expansion of 1/( (1-x)^2 * (1-x^2)^3 )^n.
 * @author Georg Fischer
 */
public class A370270 extends LambdaSequence {

  /** Construct the sequence. */
  public A370270() {
    super(0, n -> {
      final int s = 2;
      final int t = 3;
      final int u = 2;
      return Integers.SINGLETON.sum(0, n / s, k -> Binomial.binomial((long) t * n + k - 1, k).multiply(Binomial.binomial((long) (u + 1) * n - (long) s * k - 1, n - (long) s * k)));
    });
  }
}
