package irvine.oeis.a248;
// Generated by gen_seq4.pl decexp at 2021-08-11 22:35

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;
/**
 * A248192 Decimal expansion of Dedekind eta(4*i).
 * Formula: (sqrt(2)-1)^(1/4)*Gamma(1/4)/(2^(29/16)*Pi^(3/4))
 * @author Georg Fischer
 */
public class A248192 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A248192() {
    super(0, CR.SQRT2.subtract(CR.ONE).pow(CR.ONE.divide(CR.FOUR)).multiply(CrFunctions.GAMMA.cr(CR.ONE.divide(CR.FOUR))).divide(CR.TWO.pow(CR.valueOf(29).divide(CR.valueOf(16))).multiply(CR.PI.pow(CR.THREE.divide(CR.FOUR)))));
  }
}
