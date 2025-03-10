package irvine.oeis.a080;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A080509 Last term in n-th row of A080508.
 * @author Georg Fischer
 */
public class A080509 extends LambdaSequence {

  /** Construct the sequence. */
  public A080509() {
    super(1, n -> (n <= 2) ? Z.valueOf(3L * n - 2) : Functions.PRIMORIAL.z(n - 1).pow(n).divide(Functions.FACTORIAL.z(n - 1)));
  }
}
