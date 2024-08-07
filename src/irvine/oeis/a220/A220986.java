package irvine.oeis.a220;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A220986 The right Aurifeuillian factor of 10^(20n + 10) + 1.
 * a(n) = 10^(8*n + 4) + 10^(7*n + 4) + 5 * 10^(6*n + 3) + 2 * 10^(5*n + 3) + 7 * 10^(4*n + 2) + 2 * 10^(3*n + 2) + 5 * 10^(2*n + 1) + 10^(n + 1) + 1
 * @author Georg Fischer
 */
public class A220986 extends LambdaSequence {

  /** Construct the sequence. */
  public A220986() {
    super(0, n -> Z.TEN.pow(8L * n + 4).add(Z.TEN.pow(7L * n + 4)).add(Z.FIVE.multiply(Z.TEN.pow(6L * n + 3))).add(Z.TWO.multiply(Z.TEN.pow(5L * n + 3))).add(Z.SEVEN.multiply(Z.TEN.pow(4L * n + 2))).add(Z.TWO.multiply(Z.TEN.pow(3L * n + 2))).add(Z.FIVE.multiply(Z.TEN.pow(2L * n + 1))).add(Z.TEN.pow(n + 1)).add(Z.ONE));
  }
}
