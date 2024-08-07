package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-03-12/lambdan at 2024-03-12 20:32

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A371007 Expansion of e.g.f. (1/x) * Series_Reversion( 2*x/(3*exp(2*x) - 1) ).
 * @author Georg Fischer
 */
public class A371007 extends LambdaSequence {

  /** Construct the sequence. */
  public A371007() {
    super(0, n -> Integers.SINGLETON.sum(0, n + 1, k -> Z.THREE.pow(k).multiply(Z.NEG_ONE.pow(n + 1 - k)).multiply(Z.valueOf(k).pow(n)).multiply(Binomial.binomial(n + 1, k))).divide(2L * (n + 1)));
  }
}
