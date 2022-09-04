package irvine.oeis.a070;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.cons.DoubleDecimalExpansionSequence;

/**
 * A070059 Decimal expansion of proton mass (in kilograms).
 * @author Sean A. Irvine
 */
public class A070059 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A070059() {
    super(PhysicsConstants.u2kg(PhysicsConstants.PROTON_MASS), PhysicsConstants.u2kg(PhysicsConstants.PROTON_MASS_UNC), true);
  }
}
