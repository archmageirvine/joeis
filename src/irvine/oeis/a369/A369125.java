package irvine.oeis.a369;
// Generated by gen_seq4.pl serrev/lambdan at 2024-01-26 23:03

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A369125 Expansion of (1/x) * Series_Reversion( x * ((1-x)^5+x^5) ).
 * @author Georg Fischer
 */
public class A369125 extends LambdaSequence {

  /** Construct the sequence. */
  public A369125() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 5, k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial(n + k, k).multiply(Binomial.binomial(6L * n + 4, n - 5L * k)))).divide(n + 1));
  }
}
