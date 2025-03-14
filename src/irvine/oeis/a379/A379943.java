package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-01-11.ack/lambdan at 2025-01-11 22:40

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A379943 Expansion of e.g.f. 1/( exp(-x) - x )^4.
 * @author Georg Fischer
 */
public class A379943 extends LambdaSequence {

  /** Construct the sequence. */
  public A379943() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(k + 4).pow(n - k).multiply(Binomial.binomial(k + 3, 3)).divide(Functions.FACTORIAL.z(n - k)))).num());
  }
}
