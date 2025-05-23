package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-06-06/decexp at 2024-06-06 20:10

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A371861 Decimal expansion of Integral_{x=0..1} sqrt(1 - x^3) dx.
 * Formula:
 * @author Georg Fischer
 */
public class A371861 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A371861() {
    super(0, CrFunctions.GAMMA.cr(CR.ONE.divide(CR.SIX)).multiply(CrFunctions.GAMMA.cr(CR.ONE.divide(CR.THREE))).divide(CR.THREE.multiply(CR.PI.sqrt())).multiply(3).divide(10));
  }
}
