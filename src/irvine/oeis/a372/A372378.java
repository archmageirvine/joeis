package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-08/lambdan at 2024-05-08 21:31

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A372378 Expansion of (1/x) * Series_Reversion( x / (1+x+x^3)^3 ).
 * @author Georg Fischer
 */
public class A372378 extends LambdaSequence {

  /** Construct the sequence. */
  public A372378() {
    super(0, n -> {
      final int s = 3;
      final int t = 3;
      final int u = 0;
      return Integers.SINGLETON.sum(0, n / s, k -> Binomial.binomial((long) t * (n + 1), k).multiply(Binomial.binomial((long) (t + u) * (n + 1) - k, n - (long) s * k))).divide(n + 1);
    });
  }
}
