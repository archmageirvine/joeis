package irvine.oeis.a367;
// Generated by gen_seq4.pl 2025-04-30.ack/decexp at 2025-04-30 23:37

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A367730 Decimal expansion of BesselJ(0,2/sqrt(3)).
 * Formula: Decimal expansion of BesselI(0, 2/sqrt(3)).
 * @author Georg Fischer
 */
public class A367730 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A367730() {
    super(0, CrFunctions.BESSEL_J0.cr(CR.TWO.divide(CR.THREE.sqrt())));
  }
}
