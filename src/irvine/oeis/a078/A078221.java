package irvine.oeis.a078;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A078221 a(1) = 1, a(n+1) &gt; a(n) is the smallest multiple of a(n) using only odd digits.
 * a(n) = 10^(2^(n-3)) - 1
 * @author Georg Fischer
 */
public class A078221 extends LambdaSequence {

  /** Construct the sequence. */
  public A078221() {
    super(1, n -> (n <= 2) ? Z.valueOf(2L * n - 1) : Z.TEN.pow(Z.ONE.shiftLeft(n - 3)).subtract(Z.ONE));
  }
}
