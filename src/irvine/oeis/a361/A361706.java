package irvine.oeis.a361;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A361706 Inverse Moebius transform applied twice to primes.
 * @author Georg Fischer
 */
public class A361706 extends LambdaSequence {

  /** Construct the sequence. */
  public A361706() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Functions.SIGMA0.z(n / d).multiply(Functions.PRIME.z(d))));
  }
}
