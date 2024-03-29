package irvine.oeis.a258;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A258390 Number of 2n-length strings of balanced parentheses of exactly 2 different types that are introduced in ascending order.
 * a(n)=(2^(n-1)-1)*binom(2*n,n)/(n+1)
 * @author Georg Fischer
 */
public class A258390 extends LambdaSequence {

  /** Construct the sequence. */
  public A258390() {
    super(2, n -> Z.ONE.shiftLeft(n - 1).subtract(Z.ONE).multiply(Binomial.binomial(2L * n, n)).divide(Z.valueOf(n + 1)));
  }
}
