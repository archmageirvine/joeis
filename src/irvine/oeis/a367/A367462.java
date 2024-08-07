package irvine.oeis.a367;
// Generated by gen_seq4.pl serrev/lambdan at 2024-02-01 21:33

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A367462 Expansion of (1/x) * Series_Reversion( x / (1+x+x^3/(1+x)) ).
 * @author Georg Fischer
 */
public class A367462 extends LambdaSequence {

  /** Construct the sequence. */
  public A367462() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 3, k -> Binomial.binomial(n + 1, k).multiply(Binomial.binomial(n - 2L * k + 1, n - 3L * k))).divide(n + 1));
  }
}
