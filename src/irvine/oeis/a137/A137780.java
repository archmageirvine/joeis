package irvine.oeis.a137;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-12 11:03

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A137780 a(n) = 1 + 2^( prime(n + 1) - prime(n) ).
 * a(n)=1+2^(prime(n+1)-prime(n))
 * @author Georg Fischer
 */
public class A137780 extends LambdaSequence {

  /** Construct the sequence. */
  public A137780() {
    super(1, n -> Z.ONE.add(Z.TWO.pow(Puma.primeZ(n + 1).subtract(Puma.primeZ(n)))));
  }
}
