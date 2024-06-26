package irvine.oeis.a263;
// Generated by gen_seq4.pl 2024-06-25/lambdan at 2024-06-25 23:40

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A263325 a(n) = sigma(n)*pi(n^2), where sigma(n) is the sum of all (positive) divisors of n, and pi(x) is the number of primes not exceeding x.
 * @author Georg Fischer
 */
public class A263325 extends LambdaSequence {

  /** Construct the sequence. */
  public A263325() {
    super(1, n -> Functions.SIGMA1.z(Z.valueOf(n)).multiply(Functions.PRIME_PI.z(Z.valueOf(n).square())));
  }
}
