package irvine.oeis.a113;
// Generated by gen_seq4.pl decexp at 2021-07-27 10:14

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A113477 Decimal expansion of Gamma(1/3)^3/(2^(4/3)*Pi).
 * Formula: Gamma(1/3)^3/2^(4/3)/Pi
 * @author Georg Fischer
 */
public class A113477 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A113477() {
    super(0, CrFunctions.GAMMA.cr(CR.ONE.divide(CR.THREE)).pow(CR.THREE).divide(CR.TWO.pow(CR.FOUR.divide(CR.THREE))).divide(CR.PI));
  }
}
