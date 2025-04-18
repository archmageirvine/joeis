package irvine.oeis.a248;
// Generated by gen_seq4.pl decexp at 2021-08-11 22:35

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;
/**
 * A248190 Decimal expansion of Dedekind eta(I/2).
 * Formula: 2^(1/8)*Gamma(1/4)/(2*Pi^(3/4))
 * @author Georg Fischer
 */
public class A248190 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A248190() {
    super(0, CR.TWO.pow(CR.ONE.divide(CR.EIGHT)).multiply(CrFunctions.GAMMA.cr(CR.ONE.divide(CR.FOUR))).divide(CR.TWO.multiply(CR.PI.pow(CR.THREE.divide(CR.FOUR)))));
  }
}
