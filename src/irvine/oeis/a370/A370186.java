package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-02-13/lambdan at 2024-02-13 21:05

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A370186 Coefficient of x^n in the expansion of ( (1+x) * (1+x+x^3)^2 )^n.
 * @author Georg Fischer
 */
public class A370186 extends LambdaSequence {

  /** Construct the sequence. */
  public A370186() {
    super(0, n -> {
      final int s = 3;
      final int t = 2;
      final int u = 1;
      return Integers.SINGLETON.sum(0, n / s, k -> Binomial.binomial((long) t * n, k).multiply(Binomial.binomial((long) (t + u) * n - k, n - (long) s * k)));
    });
  }
}
