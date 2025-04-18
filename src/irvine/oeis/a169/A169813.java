package irvine.oeis.a169;
// Generated by gen_seq4.pl 2024-12-20.ack/lambdan at 2024-12-20 14:00

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A169813 a(n) = n XOR sigma(n), where sigma(n) is the number of divisors of n, A000203.
 * @author Georg Fischer
 */
public class A169813 extends LambdaSequence {

  /** Construct the sequence. */
  public A169813() {
    super(1, n -> Z.valueOf(n).xor(Functions.SIGMA1.z(n)));
  }
}
