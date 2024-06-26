package irvine.oeis.a216;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 10:18

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A216265 Number of primes between n^3 - n and n^3.
 * a(n) = primepi(n^3) - primepi(n^3-n);
 * @author Georg Fischer
 */
public class A216265 extends LambdaSequence {

  /** Construct the sequence. */
  public A216265() {
    super(1, n -> Functions.PRIME_PI.z(Z.valueOf(n).pow(3)).subtract(Functions.PRIME_PI.z(Z.valueOf(n).pow(3).subtract(n))));
  }
}
