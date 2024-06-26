package irvine.oeis.a277;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A277063 Number of primes &lt;= n-th Bell number.
 * a(n)=primepi(bell(n))
 * @author Georg Fischer
 */
public class A277063 extends LambdaSequence {

  /** Construct the sequence. */
  public A277063() {
    super(0, n -> Functions.PRIME_PI.z(Functions.BELL.z(n)));
  }
}
