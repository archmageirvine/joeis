package irvine.oeis.a378;
// Generated by gen_seq4.pl 2024-12-01.ack/lambdan at 2024-12-01 23:03

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A378467 Expansion of (1/x) * Series_Reversion( x * (1 - x - x^2/(1 - x)^2) ).
 * @author Georg Fischer
 */
public class A378467 extends LambdaSequence {

  /** Construct the sequence. */
  public A378467() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Binomial.binomial(n + k, k).multiply(Binomial.binomial(2L * n + k, n - 2L * k))).divide(n + 1));
  }
}
