package irvine.oeis.a114;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.LambdaSequence;

/**
 * A114846 Numbers of the form p^p - p!, where p is a prime.
 * a(n)=prime(n)^prime(n)-prime(n)!
 * @author Georg Fischer
 */
public class A114846 extends LambdaSequence {

  /** Construct the sequence. */
  public A114846() {
    super(1, n -> Puma.primeZ(n).pow(Puma.primeZ(n)).subtract(MemoryFactorial.SINGLETON.factorial(Puma.primeZ(n))));
  }
}
