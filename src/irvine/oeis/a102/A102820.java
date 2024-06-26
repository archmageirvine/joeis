package irvine.oeis.a102;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A102820 Number of primes between 2*prime(n) and 2*prime(n+1), where prime(n) is the n-th prime.
 * a(n)=primepi(2*prime(n+1))-primepi(2*prime(n))
 * @author Georg Fischer
 */
public class A102820 extends LambdaSequence {

  /** Construct the sequence. */
  public A102820() {
    super(1, n -> Functions.PRIME_PI.z(Z.TWO.multiply(Functions.PRIME.z(n + 1))).subtract(Functions.PRIME_PI.z(Z.TWO.multiply(Functions.PRIME.z(n)))));
  }
}
