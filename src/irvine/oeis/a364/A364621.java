package irvine.oeis.a364;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364621 G.f. satisfies A(x) = 1/(1-x)^2 + x*A(x)^4.
 * a(n) = sum(k=0,n,binom(n+5*k+1,6*k+1)*binom(4*k,k)/(3*k+1));
 * @author Georg Fischer
 */
public class A364621 extends LambdaSequence {

  /** Construct the sequence. */
  public A364621() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n + 5L * k + 1, 6L * k + 1).multiply(Binomial.binomial(4L * k, k)).divide(Z.valueOf(3L * k + 1))));
  }
}
