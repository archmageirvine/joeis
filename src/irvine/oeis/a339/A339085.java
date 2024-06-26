package irvine.oeis.a339;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A339085 Number of primes p with n - pi(n) &lt; p &lt;= n + pi(n), where pi(n) is the number of primes &lt;= n.
 * a(n)=primepi(n+primepi(n))-primepi(n-primepi(n))
 * @author Georg Fischer
 */
public class A339085 extends LambdaSequence {

  /** Construct the sequence. */
  public A339085() {
    super(1, n -> Functions.PRIME_PI.z(Z.valueOf(n).add(Functions.PRIME_PI.z(n))).subtract(Functions.PRIME_PI.z(n - Functions.PRIME_PI.l(n))));
  }
}
