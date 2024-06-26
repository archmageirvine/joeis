package irvine.oeis.a248;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A248744 Number of different ways one can attack all squares on an n X n chessboard with n rooks.
 * a(n)=2*n^n-n!
 * @author Georg Fischer
 */
public class A248744 extends LambdaSequence {

  /** Construct the sequence. */
  public A248744() {
    super(0, n -> Z.TWO.multiply(Z.valueOf(n).pow(n)).subtract(Functions.FACTORIAL.z(n)));
  }
}
