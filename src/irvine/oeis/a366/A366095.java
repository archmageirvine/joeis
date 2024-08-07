package irvine.oeis.a366;
// Generated by gen_seq4.pl serexp/lambdan at 2024-01-22 15:40

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A366095 Expansion of (1/x) * Series_Reversion( x*(1+x-x^3)/(1+x)^2 ).
 * @author Georg Fischer
 */
public class A366095 extends LambdaSequence {

  /** Construct the sequence. */
  public A366095() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 3, k -> Binomial.binomial(n + k, k).multiply(Binomial.binomial(n - k + 1, n - 3L * k))).divide(n + 1));
  }
}
