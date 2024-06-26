package irvine.oeis.a342;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A342695 a(n) is the number of primes in an n X n square array that do not appear on its border, with the elements of the square array being the numbers from 1..n^2, listed in increasing order by rows.
 * a(n)=primepi(n*(n-1))-primepi(n)-sum(k=1, n-2, primepi(n*k+1)-primepi(n*k))
 * @author Georg Fischer
 */
public class A342695 extends LambdaSequence {

  /** Construct the sequence. */
  public A342695() {
    super(1, n -> Functions.PRIME_PI.z(n * n - n).subtract(Functions.PRIME_PI.z(n)).subtract(Integers.SINGLETON.sum(1, n - 2, k -> Functions.PRIME_PI.z(n * k + 1).subtract(Functions.PRIME_PI.z(n * k)))));
  }
}
