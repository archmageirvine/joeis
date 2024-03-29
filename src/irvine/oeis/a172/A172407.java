package irvine.oeis.a172;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A172407 Positive numbers n such that n+10 is a prime.
 * a(n)=prime(n+4)-10
 * @author Georg Fischer
 */
public class A172407 extends LambdaSequence {

  /** Construct the sequence. */
  public A172407() {
    super(1, n -> Puma.primeZ(n + 4).subtract(Z.TEN));
  }
}
