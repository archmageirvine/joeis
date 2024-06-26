package irvine.oeis.a308;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A308599 Number of (not necessarily maximal) cliques in the n-alternating group graph.
 * a(n) = 1 + (4*n - 5)*n!/6;
 * @author Georg Fischer
 */
public class A308599 extends LambdaSequence {

  /** Construct the sequence. */
  public A308599() {
    super(2, n -> (Z.ONE).add(Z.valueOf(4L * n - 5).multiply(Functions.FACTORIAL.z(n)).divide(Z.SIX)));
  }
}
