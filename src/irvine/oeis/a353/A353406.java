package irvine.oeis.a353;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A353406 Stirling transform of odd primes.
 * a(n) = sum(k=1,n,stirl2(n,k) * prime(k+1))
 * @author Georg Fischer
 */
public class A353406 extends LambdaSequence {

  /** Construct the sequence. */
  public A353406() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.STIRLING2.z(n, k).multiply(Functions.PRIME.z(k + 1))));
  }
}
