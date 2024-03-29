package irvine.oeis.a161;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A161799 G.f. satisfies: A(x) = 1/(1 - x/(1 - x*A(x))^2)^3.
 * a(n)=sum(k=0, n, binom(3*n-2*k+2, k)/(n-k+1)*binom(n+k-1, n-k))
 * @author Georg Fischer
 */
public class A161799 extends LambdaSequence {

  /** Construct the sequence. */
  public A161799() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(3L * n - 2L * k + 2, k), Z.valueOf(n - k + 1)).multiply(Binomial.binomial(n + k - 1, n - k))).num());
  }
}
