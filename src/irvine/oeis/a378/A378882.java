package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-02-10.ack/lambdan at 2025-02-10 21:26

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A378882 G.f. A(x) satisfies A(x) = ( 1 + x*A(x)/(1 - x*A(x)^(5/3)) )^3.
 * @author Georg Fischer
 */
public class A378882 extends LambdaSequence {

  /** Construct the sequence. */
  public A378882() {
    super(0, n -> {
      final int r = 3;
      final int s = 1;
      final int t = 3;
      final int u = 5;
      return Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial((long) t * k + (long) u * (n - k) + r, k)).multiply(Binomial.binomial(n + (long) (s - 1) * k - 1, n - k)).divide((long) t * k + (long) u * (n - k) + r)).multiply(r).num();
    });
  }
}
