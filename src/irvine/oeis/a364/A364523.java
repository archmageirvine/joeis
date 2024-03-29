package irvine.oeis.a364;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364523 G.f. satisfies A(x) = 1 + x*A(x) + x^6*A(x)^6.
 * a(n) = sum(k=0,n\6,binom(n,6*k)*binom(6*k,k)/(5*k+1));
 * @author Georg Fischer
 */
public class A364523 extends LambdaSequence {

  /** Construct the sequence. */
  public A364523() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 6, k -> Binomial.binomial(n, 6L * k).multiply(Binomial.binomial(6L * k, k)).divide(Z.valueOf(5L * k + 1))));
  }
}
