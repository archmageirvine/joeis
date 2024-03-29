package irvine.oeis.a364;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-22 13:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364195 Expansion of g.f. A(x) satisfying A(x) = 1 + x * A(x)^5 * (1 + A(x)^2).
 * a(n) = sum(k=0,n,binom(n,k)*binom(5*n+2*k+1,n)/(5*n+2*k+1));
 * @author Georg Fischer
 */
public class A364195 extends LambdaSequence {

  /** Construct the sequence. */
  public A364195() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Binomial.binomial(5L * n + 2L * k + 1, n)).divide(Z.valueOf(5L * n + 2L * k + 1))));
  }
}
