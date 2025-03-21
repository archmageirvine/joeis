package irvine.oeis.a211;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A211600 a(n) = (binomial(p^n, p^(n-1)) - binomial(p^(n-1), p^(n-2))) / p^(3n-3) for p = 2.
 * @author Georg Fischer
 */
public class A211600 extends LambdaSequence {

  /** Construct the sequence. */
  public A211600() {
    super(3, n -> Binomial.binomial(Z.TWO.pow(n), Z.TWO.pow(n - 1)).subtract(Binomial.binomial(Z.TWO.pow(n - 1), Z.TWO.pow(n - 2))).divide(Z.TWO.pow(3L * n - 3)));
  }
}
