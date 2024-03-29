package irvine.oeis.a243;
// Generated by gen_seq4.pl decexpr at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A243448 Decimal expansion of 6*arcsec(sqrt(3))/Pi^(3/2), an extreme value constant.
 * Formula: 6*arccos(1/sqrt(3))/Pi^(3/2)
 * @author Georg Fischer
 */
public class A243448 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A243448() {
    super(1, CR.SIX.multiply(REALS.acos(CR.ONE.divide(CR.THREE.sqrt()))).divide(CR.PI.pow(CR.THREE.divide(CR.TWO))));
  }
}
