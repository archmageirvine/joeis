package irvine.oeis.a078;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A078301 Decimal expansion of Planck mass.
 * @author Sean A. Irvine
 */
public class A078301 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A078301() {
    super(PhysicsConstants.PLANCK_MASS, PhysicsConstants.PLANCK_MASS_UNC, true);
  }
}
