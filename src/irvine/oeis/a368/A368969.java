package irvine.oeis.a368;
// Generated by gen_seq4.pl serrev/lambdan at 2024-01-26 23:03

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A368969 Expansion of (1/x) * Series_Reversion( x * (1-x+x^2)^2 ).
 * @author Georg Fischer
 */
public class A368969 extends LambdaSequence {

  /** Construct the sequence. */
  public A368969() {
    super(0, n -> {
      final int s = 2;
      final int t = 2;
      final int u = 0;
      return Integers.SINGLETON.sum(0, n / s, k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial((long) t * (n + 1) + k - 1, k).multiply(Binomial.binomial((long) (t + u + 1) * (n + 1) - (long) (s - 1) * k - 2, n - (long) s * k)))).divide(n + 1);
    });
  }
}
