package irvine.oeis.a365;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365181 G.f. satisfies A(x) = 1 + x*A(x)^4*(1 + x*A(x)^2).
 * a(n)=sum(k=0,n,binom(2*n+2*k+1,k) * binom(k,n-k)/(2*n+2*k+1))
 * @author Georg Fischer
 */
public class A365181 extends LambdaSequence {

  /** Construct the sequence. */
  public A365181() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(2L * n + 2L * k + 1, k).multiply(Binomial.binomial(k, n - k)).divide(Z.valueOf(2L * n + 2L * k + 1))));
  }
}
