package irvine.oeis.a302;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A302481 Number of partitions of n into two parts with the smaller part prime and the larger part nonprime.
 * a(n)=sum(i=1, floor(n/2), (1-(primepi(n-i)-primepi(n-i-1)))*(primepi(i)-primepi(i-1)))
 * @author Georg Fischer
 */
public class A302481 extends LambdaSequence {

  /** Construct the sequence. */
  public A302481() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 2, i -> Z.ONE.subtract(Functions.PRIME_PI.z(n - i).subtract(Functions.PRIME_PI.z(n - i - 1))).multiply(Functions.PRIME_PI.z(i).subtract(Functions.PRIME_PI.z(i - 1)))));
  }
}
