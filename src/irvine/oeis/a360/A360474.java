package irvine.oeis.a360;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 13:33

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A360474 E.g.f. satisfies A(x) = exp( x * A(x)^2 * exp(x * A(x)^2) ).
 * a(n) = sum(k=0,n,k^(n-k)*(2*n+1)^(k-1)*binom(n,k));
 * @author Georg Fischer
 */
public class A360474 extends LambdaSequence {

  /** Construct the sequence. */
  public A360474() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(k).pow(n - k).multiply(new Q(2L * n + 1).pow(k - 1)).multiply(Binomial.binomial(n, k))).num());
  }
}
