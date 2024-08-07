package irvine.oeis.a369;
// Generated by gen_seq4.pl serrev/lambdan at 2024-02-01 21:33

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A369599 Expansion of (1/x) * Series_Reversion( x * (1/(1+x)^2 - x^3) ).
 * @author Georg Fischer
 */
public class A369599 extends LambdaSequence {

  /** Construct the sequence. */
  public A369599() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 3, k -> Binomial.binomial(n + k, k).multiply(Binomial.binomial(2L * n + 2L * k + 2, n - 3L * k))).divide(n + 1));
  }
}
