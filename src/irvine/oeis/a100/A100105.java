package irvine.oeis.a100;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A100105 a(n) = 2^prime(n)-prime(n).
 * @author Georg Fischer
 */
public class A100105 extends LambdaSequence {

  /** Construct the sequence. */
  public A100105() {
    super(1, n -> Z.TWO.pow(Functions.PRIME.z(n)).subtract(Functions.PRIME.z(n)));
  }
}
