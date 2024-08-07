package irvine.oeis.a292;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A292073 Number of dominating sets in the n X n rook complement graph.
 * a(n) = 2^(n^2) - 2*n*(2^n - 2) + n^2 - n^2*(2^(n-1)-1)^2 + n^2*(n-1)^2 - 2*binom(n,2)^2 - 1
 * @author Georg Fischer
 */
public class A292073 extends LambdaSequence {

  /** Construct the sequence. */
  public A292073() {
    super(1, n -> (n == 1) ? Z.ONE : Z.ONE.shiftLeft((long) n * n).subtract(Z.TWO.multiply(n).multiply(Z.ONE.shiftLeft(n).subtract(Z.TWO))).add(Z.valueOf(n).multiply(n)).subtract(Z.valueOf(n).multiply(n).multiply(Z.ONE.shiftLeft(n - 1).subtract(Z.ONE).square())).add(Z.valueOf(n).multiply(n).multiply(Z.valueOf(n - 1).square())).subtract(Z.TWO.multiply(Binomial.binomial(n, 2).square())).subtract(Z.ONE));
  }
}
