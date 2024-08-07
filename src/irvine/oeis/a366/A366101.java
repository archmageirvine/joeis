package irvine.oeis.a366;
// Generated by gen_seq4.pl serrev/lambdan at 2024-01-26 23:03

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A366101 Expansion of (1/x) * Series_Reversion( x*(1+x-x^5)/(1+x) ).
 * @author Georg Fischer
 */
public class A366101 extends LambdaSequence {

  /** Construct the sequence. */
  public A366101() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 5, k -> Z.NEG_ONE.pow(n - k).multiply(Binomial.binomial(n + k, k).multiply(Binomial.binomial(n - 4L * k - 1, n - 5L * k)))).divide(n + 1));
  }
}
