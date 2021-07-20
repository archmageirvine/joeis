package irvine.oeis.a081;

import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A081823 Decimal expansion of the elementary charge e in coulomb (C).
 * @author Sean A. Irvine
 */
public class A081823 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A081823() {
    super(PhysicsConstants.ELEMENTARY_CHARGE_CR.multiply(Z.TEN.pow(18)));
  }
}
