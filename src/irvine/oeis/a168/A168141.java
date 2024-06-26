package irvine.oeis.a168;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A168141 a(n) = pi(n + 1) - pi(n - 2), where pi is the prime counting function.
 * a(n)=primepi(n+1)-primepi(n-2)
 * @author Georg Fischer
 */
public class A168141 extends LambdaSequence {

  /** Construct the sequence. */
  public A168141() {
    super(1, n -> Functions.PRIME_PI.z(n + 1).subtract(Functions.PRIME_PI.z(n - 2)));
  }
}
