package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-01-11.ack/lambdan at 2025-01-11 22:40

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A379884 E.g.f. A(x) satisfies A(x) = 1/(exp(-x*A(x)^2) - x).
 * @author Georg Fischer
 */
public class A379884 extends LambdaSequence {

  /** Construct the sequence. */
  public A379884() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(n + k + 1).pow(k - 1).multiply(Binomial.binomial(n + k + 1, n - k)).divide(Functions.FACTORIAL.z(k)))).num());
  }
}
