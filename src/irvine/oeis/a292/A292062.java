package irvine.oeis.a292;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A292062 Wiener index of the n-transposition graph.
 * @author Georg Fischer
 */
public class A292062 extends LambdaSequence {

  /** Construct the sequence. */
  public A292062() {
    super(1, n -> Functions.FACTORIAL.z(n).multiply(Z.valueOf(n).multiply(Functions.FACTORIAL.z(n)).subtract(Functions.STIRLING1.z(n + 1, 2).abs())).divide(Z.TWO));
  }
}
