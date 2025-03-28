package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-02.ack/lambdan at 2024-10-02 22:45

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A376517 E.g.f. satisfies A(x) = exp(x^2 * (1 + x) * A(x)).
 * @author Georg Fischer
 */
public class A376517 extends LambdaSequence {

  /** Construct the sequence. */
  public A376517() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 2, k -> new Q(Z.valueOf(k + 1).pow(k - 1).multiply(Binomial.binomial(k, n - 2L * k)), Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
