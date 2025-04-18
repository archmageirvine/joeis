package irvine.oeis.a379;
// Generated by gen_seq4.pl 2024-12-30.ack/lambdan at 2024-12-30 19:33

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A379082 Expansion of (1/x) * Series_Reversion( x * (1/(1 + x) - x^3)^2 ).
 * @author Georg Fischer
 */
public class A379082 extends LambdaSequence {

  /** Construct the sequence. */
  public A379082() {
    super(0, n -> new Q(2).multiply(Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Binomial.binomial(2L * n + k + 2, k)).multiply(Binomial.binomial(2L * n + k + 2, n - 3L * k)).divide(2L * n + k + 2))).num());
  }
}
