package irvine.oeis.a332;
// Generated by gen_seq4.pl 2024-10-06.ack/lambdan at 2024-10-06 22:12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A332053 a(n) is the number of sets modulo n which can be formed by a finite arithmetic sequence, whose complement cannot be formed by a finite arithmetic sequence.
 * @author Georg Fischer
 */
public class A332053 extends LambdaSequence {

  /** Construct the sequence. */
  public A332053() {
    super(1, n -> (n <= 3) ? Z.ZERO : Z.valueOf(n).multiply(Functions.SIGMA1.z(n).subtract(Functions.SIGMA0.z(n)).subtract(n - (n & 1))));
  }
}
