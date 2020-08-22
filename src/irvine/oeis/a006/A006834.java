package irvine.oeis.a006;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A006834 Decimal expansion of neutron-to-proton mass ratio.
 * @author Sean A. Irvine
 */
public class A006834 extends DoubleDecimalExpansionSequence {

  private static double error() {
    final double mnR = PhysicsConstants.NEUTRON_MASS_UNC / PhysicsConstants.NEUTRON_MASS;
    final double mpR = PhysicsConstants.PROTON_MASS_UNC / PhysicsConstants.PROTON_MASS;
    final double e = mnR + mpR;
    return e * PhysicsConstants.NEUTRON_MASS / PhysicsConstants.PROTON_MASS;
  }

  /** Construct the sequence. */
  public A006834() {
    super(PhysicsConstants.NEUTRON_MASS / PhysicsConstants.PROTON_MASS, error());
  }
}
