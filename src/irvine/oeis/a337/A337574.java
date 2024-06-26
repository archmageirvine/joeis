package irvine.oeis.a337;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A337574 a(n) is the dot product of the vectors of the first n primes and the next n primes.
 * a(n) = sum(k=1,n,prime(k)*prime(n+k))
 * @author Georg Fischer
 */
public class A337574 extends LambdaSequence {

  /** Construct the sequence. */
  public A337574() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.PRIME.z(k).multiply(Functions.PRIME.z(n + k))));
  }
}
