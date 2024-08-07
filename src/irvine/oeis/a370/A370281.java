package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-02-18/lambdan at 2024-02-18 22:59

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A370281 Coefficient of x^n in the expansion of 1/( (1-x)^2 - x^3 )^n.
 * @author Georg Fischer
 */
public class A370281 extends LambdaSequence {

  /** Construct the sequence. */
  public A370281() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 3, k -> Binomial.binomial(n + k - 1, k).multiply(Binomial.binomial(3L * n - k - 1, n - 3L * k))));
  }
}
