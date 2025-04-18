package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A378128 Decimal expansion of 2/L, where L is the lemniscate constant (A062539).
 * Formula:
 * @author Georg Fischer
 */
public class A378128 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A378128() {
    super(0, CR.TWO.multiply(CR.SQRT2).multiply(CrFunctions.GAMMA.cr(CR.THREE.divide(CR.FOUR)).square()).divide(CR.PI.pow(CR.THREE.divide(CR.TWO))));
  }
}
