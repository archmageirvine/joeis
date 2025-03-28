package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-02.ack/lambdan at 2024-10-02 22:45

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A376513 Expansion of e.g.f. exp(x^3 * (1 + x)).
 * @author Georg Fischer
 */
public class A376513 extends LambdaSequence {

  /** Construct the sequence. */
  public A376513() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Binomial.binomial(k, n - 3L * k), Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
