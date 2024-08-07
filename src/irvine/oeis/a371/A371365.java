package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-03-22/lambdan at 2024-03-24 22:44

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A371365 Expansion of (1/x) * Series_Reversion( x * (1-4*x)^3 / (1-3*x) ).
 * @author Georg Fischer
 */
public class A371365 extends LambdaSequence {

  /** Construct the sequence. */
  public A371365() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.THREE.pow(n - k).multiply(Binomial.binomial(3L * n + k + 2, k)).multiply(Binomial.binomial(3L * n + 1, n - k))).divide(n + 1));
  }
}
