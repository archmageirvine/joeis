package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-08/lambdan at 2024-05-08 21:31

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A372459 Coefficient of x^n in the expansion of 1 / ( (1-x) * (1-x-x^3)^2 )^n.
 * @author Georg Fischer
 */
public class A372459 extends LambdaSequence {

  /** Construct the sequence. */
  public A372459() {
    super(0, n -> {
      final int s = 3;
      final int t = 2;
      final int u = 1;
      return Integers.SINGLETON.sum(0, n / s, k -> Binomial.binomial((long) t * n + k - 1, k).multiply(Binomial.binomial((long) (t + u + 1) * n - (long) (s - 1) * k - 1, n - (long) s * k)));
    });
  }
}
