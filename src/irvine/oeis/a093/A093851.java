package irvine.oeis.a093;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A093851 a(n) = A002283(n-1) + floor(A052268(n)/(1+n)).
 * a(n) = 10^(n-1) -1 +floor(9*10^(n-1)/(n+1));
 * @author Georg Fischer
 */
public class A093851 extends LambdaSequence {

  /** Construct the sequence. */
  public A093851() {
    super(1, n -> Z.TEN.pow(n - 1).subtract(Z.ONE).add(Z.NINE.multiply(Z.TEN.pow(n - 1)).divide(Z.valueOf(n + 1))));
  }
}
