package irvine.oeis.a365;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A365243 G.f. satisfies A(x) = 1 + x*A(x)/(1 - x^3*A(x)^2).
 * a(n) = sum(k=0,floor(n/3),binom(n-2*k-1,k) * binom(n-k+1,n-3*k)/(n-k+1))
 * @author Georg Fischer
 */
public class A365243 extends LambdaSequence {

  /** Construct the sequence. */
  public A365243() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 3, k -> Binomial.binomial(n - 2L * k - 1, k).multiply(Binomial.binomial(n - k + 1, n - 3L * k)).divide(Z.valueOf(n - k + 1))));
  }
}
