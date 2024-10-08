package irvine.oeis.a084;
// Generated by gen_seq4.pl 2024-09-11.ack/lambdan at 2024-09-11 23:28

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A084294 Number of primes in the interval [prime(n),n+prime(n)].
 * @author Georg Fischer
 */
public class A084294 extends LambdaSequence {

  /** Construct the sequence. */
  public A084294() {
    super(1, n -> Functions.PRIME_PI.z(n + Functions.PRIME.i(n)).subtract(n - 1));
  }
}
