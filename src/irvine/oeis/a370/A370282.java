package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-02-18/lambdan at 2024-02-18 22:59

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A370282 Coefficient of x^n in the expansion of 1/( (1-x)^3 - x )^n.
 * @author Georg Fischer
 */
public class A370282 extends LambdaSequence {

  /** Construct the sequence. */
  public A370282() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n + k - 1, k).multiply(Binomial.binomial(4L * n + 2L * k - 1, n - k))));
  }
}
