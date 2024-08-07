package irvine.oeis.a365;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365283 E.g.f. satisfies A(x) = 1 + x*A(x)*exp(x^2*A(x)^2).
 * @author Georg Fischer
 */
public class A365283 extends LambdaSequence {

  /** Construct the sequence. */
  public A365283() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 2, k -> new Q(Z.valueOf(n - 2L * k).pow(k).multiply(Binomial.binomial(n + 1, n - 2L * k)), Functions.FACTORIAL.z(k)).divide(Z.valueOf(n + 1))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
