package irvine.oeis.a180;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A180470 a(n) = -prime(n) + prime(n + prime(n)) - 1.
 * a(n)=-prime(n)+prime(n+prime(n))-1
 * @author Georg Fischer
 */
public class A180470 extends LambdaSequence {

  /** Construct the sequence. */
  public A180470() {
    super(1, n -> Puma.primeZ(n).negate().add(Puma.primeZ(Z.valueOf(n).add(Puma.primeZ(n)))).subtract(Z.ONE));
  }
}
