package irvine.oeis.a220;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A220506 Number of primes &lt;= n-th quarter-square.
 * a(n)=primepi(n^2/4)
 * @author Georg Fischer
 */
public class A220506 extends LambdaSequence {

  /** Construct the sequence. */
  public A220506() {
    super(1, n -> Functions.PRIME_PI.z(n * n / 4));
  }
}
