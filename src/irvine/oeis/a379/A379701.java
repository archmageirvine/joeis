package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-01-01.ack/lambdan at 2025-01-01 23:25

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A379701 Expansion of e.g.f. (1/x) * Series_Reversion( x * exp(x) / (1 + x*exp(2*x)) ).
 * @author Georg Fischer
 */
public class A379701 extends LambdaSequence {

  /** Construct the sequence. */
  public A379701() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(n - 2L * k - 1).pow(k).multiply(Binomial.binomial(n + 1, n - k)).divide(Functions.FACTORIAL.z(k)))).divide(n + 1).num());
  }
}
