package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A081823 Decimal expansion of the elementary charge e in coulomb (C).
 * @author Sean A. Irvine
 */
public class A081823 extends DecimalExpansionSequence {

  private static final CR N = PhysicsConstants.ELEMENTARY_CHARGE_CR.multiply(Z.TEN.pow(18));

  @Override
  protected CR getCR() {
    return N;
  }
}
