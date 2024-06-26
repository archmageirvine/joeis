package irvine.oeis.a302;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A302480 Number of partitions of n into two parts with the smaller part nonprime and the larger part prime.
 * a(n)=sum(i=1, floor(n/2), (primepi(n-i)-primepi(n-i-1))*(1-(primepi(i)-primepi(i-1))))
 * @author Georg Fischer
 */
public class A302480 extends LambdaSequence {

  /** Construct the sequence. */
  public A302480() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 2, i -> Functions.PRIME_PI.z(n - i).subtract(Functions.PRIME_PI.z(n - i - 1)).multiply(Z.ONE.subtract(Functions.PRIME_PI.z(i).subtract(Functions.PRIME_PI.z(i - 1))))));
  }
}
