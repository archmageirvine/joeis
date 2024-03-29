package irvine.oeis.a176;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A176335 Central coefficients T(2n,n) of number triangle A176331.
 * a(n) = sum(k=0,2*n,binom(k,n)^2*(-1)^k)
 * @author Georg Fischer
 */
public class A176335 extends LambdaSequence {

  /** Construct the sequence. */
  public A176335() {
    super(0, n -> Integers.SINGLETON.sum(0, 2 * n, k -> Binomial.binomial(k, n).square().multiply(Z.NEG_ONE.pow(k))));
  }
}
