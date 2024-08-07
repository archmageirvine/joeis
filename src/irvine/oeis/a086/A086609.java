package irvine.oeis.a086;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A086609 Number of primes between consecutive partition numbers.
 * @author Georg Fischer
 */
public class A086609 extends LambdaSequence {

  /** Construct the sequence. */
  public A086609() {
    super(0, n -> Functions.PRIME_PI.z(Functions.PARTITIONS.z(n + 1)).subtract(Functions.PRIME_PI.z(Functions.PARTITIONS.z(n))));
  }
}
