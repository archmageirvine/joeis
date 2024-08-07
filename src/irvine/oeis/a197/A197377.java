package irvine.oeis.a197;
// Generated by gen_seq4.pl decexpr at 2021-07-19 22:15

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197377 Decimal expansion of least x&gt;0 having sin(x) = sin(x/3)^2.
 * Formula: 3*asin(6/8)
 * @author Georg Fischer
 */
public class A197377 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A197377() {
    super(1, CR.THREE.multiply(REALS.asin(CR.SIX.divide(CR.EIGHT))));
  }
}
