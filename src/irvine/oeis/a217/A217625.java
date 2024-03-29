package irvine.oeis.a217;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A217625 Prime(prime(n^3)).
 * a(n)=prime(prime(n^3))
 * @author Georg Fischer
 */
public class A217625 extends LambdaSequence {

  /** Construct the sequence. */
  public A217625() {
    super(1, n -> Puma.primeZ(Puma.primeZ(Z.valueOf(n).pow(3))));
  }
}
