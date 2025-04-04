package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-02-02.ack/lambdan at 2025-02-02 21:39

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A380717 E.g.f. A(x) satisfies A(x) = exp(x * A(x)^2 * (1 - x*A(x))^2) / (1 - x*A(x)).
 * @author Georg Fischer
 */
public class A380717 extends LambdaSequence {

  /** Construct the sequence. */
  public A380717() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(n + k + 1).pow(k - 1).multiply(Binomial.binomial(2L * n - 2L * k, n - k)).divide(Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
