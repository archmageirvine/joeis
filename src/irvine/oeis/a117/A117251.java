package irvine.oeis.a117;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-26 21:16

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A117251 Column 0 of triangle A117250.
 * a(n)=(-1)^(n-1)*2^((n-1)*(n-2)/2-1)*binom(2*n,n)/(2*n-1)
 * @author Georg Fischer
 */
public class A117251 extends LambdaSequence {

  /** Construct the sequence. */
  public A117251() {
    super(0, n -> (n <= 1) ? Z.ONE : ((n == 2) ? Z.NEG_ONE : Z.NEG_ONE.pow(n + 1).multiply(Z.ONE.shiftLeft((long) (n - 1) * (n - 2) / 2 - 1).multiply(Binomial.binomial(2L * n, n)).divide(Z.valueOf(2L * n - 1)))));
  }
}
