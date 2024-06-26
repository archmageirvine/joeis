package irvine.oeis.a308;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A308773 Sum of the second largest parts in the partitions of n into 4 prime parts.
 * a(n)=sum(k=1, floor(n/4), sum(j=k, floor((n-k)/3), sum(i=j, floor((n-j-k)/2), i*(primepi(k)-primepi(k-1))*(primepi(j)-primepi(j-1))*(primepi(i)-primepi(i-1))*(primepi(n-i-j-k)-primepi(n-i-j-k-1)))))
 * @author Georg Fischer
 */
public class A308773 extends LambdaSequence {

  /** Construct the sequence. */
  public A308773() {
    super(0, n -> Integers.SINGLETON.sum(1, n / 4, k -> Integers.SINGLETON.sum(k, (n - k) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k) / 2, i -> Z.valueOf(i).multiply(Functions.PRIME_PI.z(k).subtract(Functions.PRIME_PI.z(k - 1))).multiply(Functions.PRIME_PI.z(j).subtract(Functions.PRIME_PI.z(j - 1))).multiply(Functions.PRIME_PI.z(i).subtract(Functions.PRIME_PI.z(i - 1))).multiply(Functions.PRIME_PI.z(n - i - j - k).subtract(Functions.PRIME_PI.z(n - i - j - k - 1)))))));
  }
}
