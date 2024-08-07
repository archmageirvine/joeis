package irvine.oeis.a366;
// Generated by gen_seq4.pl 2023-09-28/lambda at 2023-09-28 21:04

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A366054 Expansion of (1/x) * Series_Reversion( x*(1-x)^2/(1-x+x^4) ).
 * @author Georg Fischer
 */
public class A366054 extends LambdaSequence {

  /** Construct the sequence. */
  public A366054() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 4, k -> Binomial.binomial(n + 1, k).multiply(Binomial.binomial(2L * n - 3L * k, n - 4L * k))).divide(n + 1));
  }
}
