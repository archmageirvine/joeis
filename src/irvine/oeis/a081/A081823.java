package irvine.oeis.a081;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A081823 Decimal expansion of the elementary charge e in coulomb <code>(C)</code>.
 * @author Sean A. Irvine
 */
public class A081823 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A081823() {
    super(PhysicsConstants.ELEMENTARY_CHARGE, PhysicsConstants.ELEMENTARY_CHARGE_UNC, true);
  }
}
