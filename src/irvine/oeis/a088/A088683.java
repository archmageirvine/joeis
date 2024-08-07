package irvine.oeis.a088;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A088683 a(n) = prime(3*n+2) - prime(3*n).
 * @author Georg Fischer
 */
public class A088683 extends LambdaSequence {

  /** Construct the sequence. */
  public A088683() {
    super(1, n -> Functions.PRIME.z(3 * n + 2).subtract(Functions.PRIME.z(3 * n)));
  }
}
