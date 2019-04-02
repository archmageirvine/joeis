package irvine.oeis.a005;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A005601 Decimal expansion of proton-to-electron mass ratio.
 * @author Sean A. Irvine
 */
public class A005601 extends DoubleDecimalExpansionSequence {

  private static double error() {
    final double mpR = PhysicsConstants.PROTON_MASS_UNC / PhysicsConstants.PROTON_MASS;
    final double meR = PhysicsConstants.ELECTRON_MASS_UNC / PhysicsConstants.ELECTRON_MASS;
    final double e = mpR + meR;
    return e * PhysicsConstants.PROTON_MASS / PhysicsConstants.ELECTRON_MASS;
  }

  /** Construct the sequence. */
  public A005601() {
    super(PhysicsConstants.PROTON_MASS / PhysicsConstants.ELECTRON_MASS, error());
  }
}
