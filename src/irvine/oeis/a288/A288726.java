package irvine.oeis.a288;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A288726 a(n) = Sum_{i=floor((n-1)/2)..n-1} i * c(i), where c is the prime characteristic (A010051).
 * a(n)=sum(i=floor((n-1)/2), n-1, i*(primepi(i)-primepi(i-1)))
 * @author Georg Fischer
 */
public class A288726 extends LambdaSequence {

  /** Construct the sequence. */
  public A288726() {
    super(0, n -> Integers.SINGLETON.sum((n - 1) / 2, n - 1, i -> Z.valueOf(i).multiply(Functions.PRIME_PI.z(i).subtract(Functions.PRIME_PI.z(i - 1)))));
  }
}
