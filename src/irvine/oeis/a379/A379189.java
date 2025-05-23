package irvine.oeis.a379;
// Generated by gen_seq4.pl 2024-12-30.ack/lambdan at 2024-12-30 19:33

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A379189 G.f. A(x) satisfies A(x) = 1/((1 - x*A(x)^3) * (1 - x*A(x))).
 * @author Georg Fischer
 */
public class A379189 extends LambdaSequence {

  /** Construct the sequence. */
  public A379189() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(n + 3L * k + 1, k)).multiply(Binomial.binomial(2L * n + k, n - k)).divide(n + 3L * k + 1)).num());
  }
}
