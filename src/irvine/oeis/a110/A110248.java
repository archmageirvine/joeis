package irvine.oeis.a110;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A110248 Row sums of a Jacobi number triangle.
 * @author Georg Fischer
 */
public class A110248 extends LambdaSequence {

  /** Construct the sequence. */
  public A110248() {
    super(0, n -> (n <= 0) ? Z.ONE : Integers.SINGLETON.sum(0, n, k -> Functions.JACOBI.z(k, 2L * n - 2L * k + 1)));
  }
}
