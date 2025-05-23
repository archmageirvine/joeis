package irvine.oeis.a240;
// Generated by gen_seq4.pl decexp at 2021-08-11 22:35

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;
/**
 * A240964 Decimal expansion of Sum_{n&gt;=1} n/sinh(n*Pi).
 * Formula: Gamma(1/4)^4/(32*Pi^3)-1/(4*Pi)
 * @author Georg Fischer
 */
public class A240964 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A240964() {
    super(0, CrFunctions.GAMMA.cr(CR.ONE.divide(CR.FOUR)).pow(4).divide(CR.valueOf(32).multiply(CR.PI.pow(CR.THREE))).subtract(CR.ONE.divide(CR.FOUR.multiply(CR.PI))));
  }
}
