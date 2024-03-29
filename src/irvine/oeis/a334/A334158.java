package irvine.oeis.a334;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A334158 Number of Goldbach partitions (p,q) of 2n such that primes p and q can be written as the sum of two primes.
 * a(n)=sum(i=1, n, (primepi(i-2)-primepi(i-3))*(primepi(2*n-i-2)-primepi(2*n-i-3))*(primepi(i)-primepi(i-1))*(primepi(2*n-i)-primepi(2*n-i-1)))
 * @author Georg Fischer
 */
public class A334158 extends LambdaSequence {

  /** Construct the sequence. */
  public A334158() {
    super(1, n -> Integers.SINGLETON.sum(1, n, i -> Puma.primePiZ(i - 2).subtract(Puma.primePiZ(i - 3)).multiply(Puma.primePiZ(2L * n - i - 2).subtract(Puma.primePiZ(2L * n - i - 3))).multiply(Puma.primePiZ(i).subtract(Puma.primePiZ(i - 1))).multiply(Puma.primePiZ(2L * n - i).subtract(Puma.primePiZ(2L * n - i - 1)))));
  }
}
