package irvine.oeis.a291;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A291542 a(n) = prime(n)^3 - prime(n) * prime(n^2).
 * a(n)=prime(n)^3-prime(n)*prime(n^2)
 * @author Georg Fischer
 */
public class A291542 extends LambdaSequence {

  /** Construct the sequence. */
  public A291542() {
    super(1, n -> Functions.PRIME.z(n).pow(Z.THREE).subtract(Functions.PRIME.z(n).multiply(Functions.PRIME.z(n * n))));
  }
}
