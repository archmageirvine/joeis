package irvine.oeis.a291;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A291539 a(n) = PrimePi(n^3) - PrimePi(n) * PrimePi(n^2), where PrimePi = A000720.
 * a(n)=primepi(n^3)-primepi(n)*primepi(n^2)
 * @author Georg Fischer
 */
public class A291539 extends LambdaSequence {

  /** Construct the sequence. */
  public A291539() {
    super(1, n -> Functions.PRIME_PI.z(Z.valueOf(n).pow(3)).subtract(Functions.PRIME_PI.z(n).multiply(Functions.PRIME_PI.z(n * n))));
  }
}
