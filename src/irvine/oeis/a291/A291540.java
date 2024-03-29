package irvine.oeis.a291;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A291540 a(n) = PrimePi(n) * PrimePi(n^2) - PrimePi(n)^3, where PrimePi = A000720.
 * a(n)=primepi(n)*primepi(n^2)-primepi(n)^3
 * @author Georg Fischer
 */
public class A291540 extends LambdaSequence {

  /** Construct the sequence. */
  public A291540() {
    super(1, n -> Puma.primePiZ(n).multiply(Puma.primePiZ((long) n * n)).subtract(Puma.primePiZ(n).pow(Z.THREE)));
  }
}
