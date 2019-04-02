package irvine.oeis.a081;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A081801 Decimal expansion of electron mass in kg.
 * @author Sean A. Irvine
 */
public class A081801 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A081801() {
    super(PhysicsConstants.u2kg(PhysicsConstants.ELECTRON_MASS), PhysicsConstants.u2kg(PhysicsConstants.ELECTRON_MASS_UNC), true);
  }
}
