package irvine.oeis.a200;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A200719 G.f. satisfies A(x) = (1 + x*A(x)^2) * (1 + x^2*A(x)^5).
 * a(n)=sum(k=0,floor(n/2),binom(2*n+k+1,k) * binom(2*n+k+1,n-2*k) / (2*n+k+1))
 * @author Georg Fischer
 */
public class A200719 extends LambdaSequence {

  /** Construct the sequence. */
  public A200719() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Binomial.binomial(2L * n + k + 1, k).multiply(Binomial.binomial(2L * n + k + 1, n - 2L * k)).divide(Z.valueOf(2L * n + k + 1))));
  }
}
