package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A081824 Decimal expansion of conductance quantum in units of S.
 * @author Sean A. Irvine
 */
public class A081824 extends DecimalExpansionSequence {

  /** Conductance quantum G_0 in S. */
  private static final CR CONDUCTANCE_QUANTUM = PhysicsConstants.ELEMENTARY_CHARGE_CR.multiply(PhysicsConstants.ELEMENTARY_CHARGE_CR).multiply(CR.TWO).divide(PhysicsConstants.PLANCK_CONSTANT_CR).multiply(CR.valueOf(10000));

  @Override
  protected CR getCR() {
    return CONDUCTANCE_QUANTUM;
  }
}
