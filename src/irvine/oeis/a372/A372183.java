package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A372183 E.g.f. A(x) satisfies A(x) = exp( x * A(x)^5 / (1 - x * A(x)^2) ).
 * @author Georg Fischer
 */
public class A372183 extends LambdaSequence {

  /** Construct the sequence. */
  public A372183() {
    super(0, n -> {
      final int r = 1;
      final int s = 1;
      final int t = 5;
      final int u = 2;
      return Rationals.SINGLETON.sum(0, n, k -> new Q((long) t * k + (long) u * (n - k) + r).pow(k - 1).multiply(Binomial.binomial(n + (long) (s - 1) * k - 1, n - k)).divide(Functions.FACTORIAL.z(k))).multiply(r).multiply(Functions.FACTORIAL.z(n)).num();
    });
  }
}
