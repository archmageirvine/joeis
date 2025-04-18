package irvine.oeis.a289;
// Generated by gen_seq4.pl 2024-12-20.ack/lambdan at 2024-12-20 14:00

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A289495 Number of primes in the interval [4n, 5n].
 * @author Georg Fischer
 */
public class A289495 extends LambdaSequence {

  /** Construct the sequence. */
  public A289495() {
    super(1, n -> Functions.PRIME_PI.z(5 * n).subtract(Functions.PRIME_PI.z(4 * n)));
  }
}
