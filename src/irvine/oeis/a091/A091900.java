package irvine.oeis.a091;
// Generated by gen_seq4.pl dexcr CR.ONE.divide(CR.TAU.divide(CR.FIVE.sqrt()).exp().multiply(CR.FIVE.sqrt().divide(CR.ONE.add(REALS.pow(REALS.pow(CR.FIVE, CR.THREE.divide(CR.FOUR)).multiply(REALS.pow(CR.PHI.subtract(CR.ONE), CR.FIVE.divide(CR.TWO))).subtract(CR.ONE), CR.ONE.divide(CR.FIVE)))).subtract(CR.PHI))) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A091900 Decimal expansion of 1/(exp(2*Pi/sqrt(5))*(sqrt(5)/(1+(5^(3/4)*(phi-1)^(5/2)-1)^(1/5))-phi)).
 * @author Georg Fischer
 */
public class A091900 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A091900() {
    super(CR.ONE.divide(CR.TAU.divide(CR.FIVE.sqrt()).exp().multiply(CR.FIVE.sqrt().divide(CR.ONE.add(REALS.pow(REALS.pow(CR.FIVE, CR.THREE.divide(CR.FOUR)).multiply(REALS.pow(CR.PHI.subtract(CR.ONE), CR.FIVE.divide(CR.TWO))).subtract(CR.ONE), CR.ONE.divide(CR.FIVE)))).subtract(CR.PHI))));
  }
}
