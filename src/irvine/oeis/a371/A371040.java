package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-03-12/lambdan at 2024-03-12 20:32

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A371040 E.g.f. satisfies A(x) = exp(x^3*A(x)^2) / (1-x).
 * @author Georg Fischer
 */
public class A371040 extends LambdaSequence {

  /** Construct the sequence. */
  public A371040() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Z.valueOf(2L * k + 1).pow(k - 1).multiply(Binomial.binomial(n - k, n - 3L * k)), Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
