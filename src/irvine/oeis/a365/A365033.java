package irvine.oeis.a365;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 13:33

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A365033 E.g.f. satisfies A(x) = exp(x * A(x)^2 * (1 + x * A(x))^2).
 * a(n) = n!*sum(k=0,n,(n+k+1)^(k-1)*binom(2*k,n-k)/k!);
 * @author Georg Fischer
 */
public class A365033 extends LambdaSequence {

  /** Construct the sequence. */
  public A365033() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(n + k + 1).pow(k - 1).multiply(Binomial.binomial(2L * k, n - k)).divide(Functions.FACTORIAL.z(k)))).num());
  }
}
