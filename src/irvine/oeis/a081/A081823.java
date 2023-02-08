package irvine.oeis.a081;

import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A081823 Decimal expansion of the elementary charge e in coulombs (C).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A081823 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A081823() {
    super(1, PhysicsConstants.ELEMENTARY_CHARGE_CR.multiply(Z.TEN.pow(18)));
  }

  @Override
  public int getOffset() {
    return -18;
  }
}
