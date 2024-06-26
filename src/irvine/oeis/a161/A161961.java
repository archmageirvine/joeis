package irvine.oeis.a161;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A161961 Denominator of ratio in lowest terms of pi(n^2)/(n*pi(n)), where pi(x) = A000720(x).
 * a(n)=primepi(n^2)/(n*primepi(n))
 * @author Georg Fischer
 */
public class A161961 extends LambdaSequence {

  /** Construct the sequence. */
  public A161961() {
    super(2, n -> new Q(Functions.PRIME_PI.z(n * n), Z.valueOf(n).multiply(Functions.PRIME_PI.z(n))).den());
  }
}
