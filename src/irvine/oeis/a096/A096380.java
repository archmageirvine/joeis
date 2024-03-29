package irvine.oeis.a096;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 08:51

import irvine.factor.prime.Puma;
import irvine.oeis.LambdaSequence;

/**
 * A096380 Differences between the sum of the first three primes and the fourth prime in consecutive prime quadruples.
 * a(n)=prime(n) + prime(n+1)+prime(n+2) - prime(n+3)
 * @author Georg Fischer
 */
public class A096380 extends LambdaSequence {

  /** Construct the sequence. */
  public A096380() {
    super(1, n -> Puma.primeZ(n).add(Puma.primeZ(n + 1)).add(Puma.primeZ(n + 2)).subtract(Puma.primeZ(n + 3)));
  }
}
