package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-02.ack/lambdan at 2024-10-02 22:45

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A376577 E.g.f. A(x) satisfies A(x) = exp(x*(1 + x^2)*A(x)).
 * @author Georg Fischer
 */
public class A376577 extends LambdaSequence {

  /** Construct the sequence. */
  public A376577() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Z.valueOf(n - 2L * k + 1).pow(n - 2L * k - 1).multiply(Binomial.binomial(n - 2L * k, k)), Functions.FACTORIAL.z(n - 2 * k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
