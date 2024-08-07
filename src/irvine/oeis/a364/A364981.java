package irvine.oeis.a364;
// Generated by gen_seq4.pl 2023-09-19/lambda at 2023-09-19 18:32

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364981 E.g.f. satisfies A(x) = 1 + x*A(x)*exp(x*A(x)^3).
 * @author Georg Fischer
 */
public class A364981 extends LambdaSequence {

  /** Construct the sequence. */
  public A364981() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(Z.valueOf(k).pow(n - k).multiply(Binomial.binomial(3L * n - 2L * k + 1, k)), Z.valueOf(3L * n - 2L * k + 1).multiply(Functions.FACTORIAL.z(n - k))))).num());
  }
}
