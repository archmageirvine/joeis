package irvine.oeis.a327;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A327996 Decimal expansion of (1/2)*Pi^(3/4)/Gamma(3/4).
 * Formula:
 * @author Georg Fischer
 */
public class A327996 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A327996() {
    super(0, CR.PI.pow(CR.ONE.divide(CR.FOUR)).divide(CR.TWO.multiply(CrFunctions.GAMMA.cr(CR.THREE.divide(CR.FOUR)))).multiply(CR.PI.sqrt()));
  }
}
