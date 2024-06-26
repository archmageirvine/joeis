package irvine.oeis.a289;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A289493 Number of primes in the interval [2n, 3n].
 * @author Georg Fischer
 */
public class A289493 extends LambdaSequence {

  /** Construct the sequence. */
  public A289493() {
    super(1, n -> (n == 1) ? Z.TWO : Functions.PRIME_PI.z(3 * n).subtract(Functions.PRIME_PI.z(2 * n)));
  }
}
