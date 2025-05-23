package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A381982 E.g.f. A(x) satisfies A(x) = exp(x) * C(x*A(x)), where C(x) = 1 + x*C(x)^2 is the g.f. of A000108.
 * @author Georg Fischer
 */
public class A381982 extends LambdaSequence {

  /** Construct the sequence. */
  public A381982() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(k + 1).pow(n - k).multiply(Binomial.binomial(3 * k + 1, k)).divide(new Q(3 * k + 1).multiply(Functions.FACTORIAL.z(n - k))))).num());
  }
}
