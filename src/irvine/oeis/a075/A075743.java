package irvine.oeis.a075;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A075743 For all numbers of the form 6 +- 1 starting with 5,7,11,13,..., '1' indicates prime and '0' indicates composite.
 * @author Georg Fischer
 */
public class A075743 extends LambdaSequence {

  /** Construct the sequence. */
  public A075743() {
    super(1, n -> Functions.PRIME_PI.z(3 * n + 3).subtract(Functions.PRIME_PI.z(3 * n)));
  }
}
