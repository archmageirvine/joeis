package irvine.oeis.a364;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364340 G.f. satisfies A(x) = (1 + x*A(x)) * (1 + x*A(x)^6).
 * a(n) = sum(k=0,n,binom(n+5*k+1,k)*binom(n+5*k+1,n-k)/(n+5*k+1));
 * @author Georg Fischer
 */
public class A364340 extends LambdaSequence {

  /** Construct the sequence. */
  public A364340() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n + 5L * k + 1, k).multiply(Binomial.binomial(n + 5L * k + 1, n - k)).divide(Z.valueOf(n + 5L * k + 1))));
  }
}
