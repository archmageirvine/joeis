package irvine.oeis.a113;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A113847 Decimal expansion of beta'(0) : the derivative of the Dirichlet beta function evaluated at zero.
 * Formula:
 * @author Georg Fischer
 */
public class A113847 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A113847() {
    super(0, CrFunctions.GAMMA.cr(CR.ONE.divide(CR.FOUR)).square().divide(CR.TWO.pow(CR.THREE.divide(CR.TWO)).multiply(CR.PI)).log());
  }
}
