package irvine.oeis.a364;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364597 G.f. satisfies A(x) = 1/(1-x) + x^3*(1-x)*A(x)^5.
 * a(n) = sum(k=0,n\3,binom(n,3*k)*binom(5*k,k)/(4*k+1));
 * @author Georg Fischer
 */
public class A364597 extends LambdaSequence {

  /** Construct the sequence. */
  public A364597() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 3, k -> Binomial.binomial(n, 3L * k).multiply(Binomial.binomial(5L * k, k)).divide(Z.valueOf(4L * k + 1))));
  }
}
