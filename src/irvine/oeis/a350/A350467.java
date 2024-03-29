package irvine.oeis.a350;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-27 21:29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A350467 a(n) = hypergeom([1/2 - n/2, -n/2], [-n], -8*n).
 * a(n)=sum(k=0,n,binom(n - k,k)*(2*n)^k)
 * @author Georg Fischer
 */
public class A350467 extends LambdaSequence {

  /** Construct the sequence. */
  public A350467() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n - k, k).multiply(Z.valueOf(2L * n).pow(k))));
  }
}
