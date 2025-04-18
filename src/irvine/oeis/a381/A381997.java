package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A381997 E.g.f. A(x) satisfies A(x) = 1 + x*exp(2*x)*A(x)^4.
 * @author Georg Fischer
 */
public class A381997 extends LambdaSequence {

  /** Construct the sequence. */
  public A381997() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(2 * k).pow(n - k).multiply(Binomial.binomial(4 * k + 1, k)).divide(new Q(4 * k + 1).multiply(Functions.FACTORIAL.z(n - k))))).num());
  }
}
