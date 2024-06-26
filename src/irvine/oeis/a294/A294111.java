package irvine.oeis.a294;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A294111 Sum of the smaller parts of the partitions of n into two parts with larger part prime.
 * a(n)=sum(i=1, floor(n/2), i*(primepi(n-i)-primepi(n-i-1)))
 * @author Georg Fischer
 */
public class A294111 extends LambdaSequence {

  /** Construct the sequence. */
  public A294111() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 2, i -> Z.valueOf(i).multiply(Functions.PRIME_PI.z(n - i).subtract(Functions.PRIME_PI.z(n - i - 1)))));
  }
}
