package irvine.oeis.a323;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-21 21:22

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A323118 a(n) = U_{n}(n) where U_{n}(x) is a Chebyshev polynomial of the second kind.
 * @author Georg Fischer
 */
public class A323118 extends LambdaSequence {

  /** Construct the sequence. */
  public A323118() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(2L * n - 2).pow(k).multiply(Binomial.binomial(n + 1 + k, 2L * k + 1))));
  }
}
