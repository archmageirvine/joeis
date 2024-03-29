package irvine.oeis.a364;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A364305 a(n) = (8*n)!*(5*n)!*(3*n)! / ( (6*n)!*(4*n)!^2*n!^2 ).
 * a(n)=sum(k=0,n,binom(8*n,n-k)^2 * binom(6*n+k-1,k))
 * @author Georg Fischer
 */
public class A364305 extends LambdaSequence {

  /** Construct the sequence. */
  public A364305() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(8L * n, n - k).square().multiply(Binomial.binomial(6L * n + k - 1, k))));
  }
}
