package irvine.oeis.a365;
// Generated by gen_seq4.pl 2023-09-19/lambda at 2023-09-19 18:32

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365040 E.g.f. satisfies A(x) = exp(x * (1 + x)/A(x)^3).
 * @author Georg Fischer
 */
public class A365040 extends LambdaSequence {

  /** Construct the sequence. */
  public A365040() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(Z.valueOf(-3L * k + 1).pow(k - 1).multiply(Binomial.binomial(k, n - k)), Functions.FACTORIAL.z(k)))).num());
  }
}
