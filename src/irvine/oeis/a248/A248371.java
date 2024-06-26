package irvine.oeis.a248;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A248371 Number of primes in Breusch's interval [n; 9(n+3)/8].
 * a(n)=primepi((n+3)*9/8)-primepi(n-1)
 * @author Georg Fischer
 */
public class A248371 extends LambdaSequence {

  /** Construct the sequence. */
  public A248371() {
    super(0, n -> Functions.PRIME_PI.z(Z.valueOf(n + 3).multiply(Z.NINE).divide(Z.EIGHT)).subtract(Functions.PRIME_PI.z(n - 1)));
  }
}
