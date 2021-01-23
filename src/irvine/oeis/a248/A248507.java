package irvine.oeis.a248;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A248507 Decimal expansion of a single magnetic flux quantum Phi_0 in SI units.
 * @author Sean A. Irvine
 */
public class A248507 extends DecimalExpansionSequence {

  private static final CR MAGNETIC_FLUX_QUANTUM = PhysicsConstants.PLANCK_CONSTANT_CR.divide(PhysicsConstants.ELEMENTARY_CHARGE_CR).divide(CR.TWO).multiply(Z.TEN.pow(15));

  @Override
  protected CR getCR() {
    return MAGNETIC_FLUX_QUANTUM;
  }
}
