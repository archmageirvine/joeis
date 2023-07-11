package irvine.oeis.a006;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.cons.DoubleDecimalExpansionSequence;

/**
 * A006833 Decimal expansion of neutron-to-electron mass ratio.
 * @author Sean A. Irvine
 */
public class A006833 extends DoubleDecimalExpansionSequence {

  private static double error() {
    final double mnR = PhysicsConstants.NEUTRON_MASS_UNC / PhysicsConstants.NEUTRON_MASS;
    final double meR = PhysicsConstants.ELECTRON_MASS_UNC / PhysicsConstants.ELECTRON_MASS;
    final double e = mnR + meR;
    return e * PhysicsConstants.NEUTRON_MASS / PhysicsConstants.ELECTRON_MASS;
  }

  /** Construct the sequence. */
  public A006833() {
    super(4, PhysicsConstants.NEUTRON_MASS / PhysicsConstants.ELECTRON_MASS, error());
  }
}
