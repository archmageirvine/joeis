package irvine.oeis.a364;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364596 G.f. satisfies A(x) = 1/(1-x) + x^3*(1-x)*A(x)^4.
 * a(n) = sum(k=0,n\3,binom(n-k,2*k)*binom(4*k,k)/(3*k+1));
 * @author Georg Fischer
 */
public class A364596 extends LambdaSequence {

  /** Construct the sequence. */
  public A364596() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 3, k -> Binomial.binomial(n - k, 2L * k).multiply(Binomial.binomial(4L * k, k)).divide(Z.valueOf(3L * k + 1))));
  }
}
