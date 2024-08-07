package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A372161 E.g.f. A(x) satisfies A(x) = exp( 3 * x / (1 - x * A(x)^(1/3)) ).
 * @author Georg Fischer
 */
public class A372161 extends LambdaSequence {

  /** Construct the sequence. */
  public A372161() {
    super(0, n -> {
      final int r = 3;
      final int s = 1;
      final int t = 0;
      final int u = 1;
      return Rationals.SINGLETON.sum(0, n, k -> new Q((long) t * k + u * (n - k) + r).pow(k - 1).multiply(Binomial.binomial(n + (long) (s - 1) * k - 1, n - k)).divide(Functions.FACTORIAL.z(k))).multiply(r).multiply(Functions.FACTORIAL.z(n)).num();
    });
  }
}
