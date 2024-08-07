package irvine.oeis.a366;
// Generated by gen_seq4.pl 2023-09-28/lambda at 2023-09-28 21:04

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A366024 Expansion of (1/x) * Series_Reversion( x*(1-x)*(1+x^5) ).
 * @author Georg Fischer
 */
public class A366024 extends LambdaSequence {

  /** Construct the sequence. */
  public A366024() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 5, k -> Binomial.binomial(n + k, n).multiply(Binomial.binomial(2L * n - 5L * k, n)).multiply(Z.NEG_ONE.pow(k))).divide(n + 1));
  }
}
