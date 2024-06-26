package irvine.oeis.a269;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A269801 Total sum of the divisors of the primes p,q such that n=p+q and p&gt;=q.
 * a(n)=(n+2)*sum(i=2, floor(n/2), (primepi(i)-primepi(i-1))*(primepi(n-i)-primepi(n-i-1)))
 * @author Georg Fischer
 */
public class A269801 extends LambdaSequence {

  /** Construct the sequence. */
  public A269801() {
    super(0, n -> Z.valueOf(n + 2).multiply(Integers.SINGLETON.sum(2, n / 2, i -> Functions.PRIME_PI.z(i).subtract(Functions.PRIME_PI.z(i - 1)).multiply(Functions.PRIME_PI.z(n - i).subtract(Functions.PRIME_PI.z(n - i - 1))))));
  }
}
