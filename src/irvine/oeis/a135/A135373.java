package irvine.oeis.a135;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A135373 a(n) = prime(2^(n + 1)) - prime(2^n).
 * a(n)=prime(2^(n+1))-prime(2^n)
 * @author Georg Fischer
 */
public class A135373 extends LambdaSequence {

  /** Construct the sequence. */
  public A135373() {
    super(0, n -> Puma.primeZ(Z.ONE.shiftLeft(n + 1)).subtract(Puma.primeZ(Z.ONE.shiftLeft(n))));
  }
}
