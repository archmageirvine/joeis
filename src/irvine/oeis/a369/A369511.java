package irvine.oeis.a369;
// Generated by gen_seq4.pl serrev/lambdan at 2024-01-26 23:03

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A369511 Expansion of (1/x) * Series_Reversion( x * ((1-x)^2-x^3)^2 ).
 * @author Georg Fischer
 */
public class A369511 extends LambdaSequence {

  /** Construct the sequence. */
  public A369511() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 3, k -> Binomial.binomial(2L * n + k + 1, k).multiply(Binomial.binomial(5L * n - k + 3, n - 3L * k))).divide(n + 1));
  }
}
