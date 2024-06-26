package irvine.oeis.a236;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A236223 Sum of the fifteenth powers of the first n primes.
 * a(n)=sum(k=1, n, prime(k)^15)
 * @author Georg Fischer
 */
public class A236223 extends LambdaSequence {

  /** Construct the sequence. */
  public A236223() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Functions.PRIME.z(k).pow(Z.valueOf(15))));
  }
}
