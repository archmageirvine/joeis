package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-01-11.ack/lambdan at 2025-01-11 22:40

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A379866 Expansion of e.g.f. (1/x) * Series_Reversion( x / (exp(-x) + x)^2 ).
 * @author Georg Fischer
 */
public class A379866 extends LambdaSequence {

  /** Construct the sequence. */
  public A379866() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(-2L * n + k - 2).pow(n - k - 1).multiply(Binomial.binomial(2L * n + 1, k)).divide(Functions.FACTORIAL.z(n - k))).multiply(Functions.FACTORIAL.z(n).multiply(2).negate()).num());
  }
}
