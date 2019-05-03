package irvine.oeis.a003;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A003675 Decimal expansion of neutron mass <code>(mass units)</code>.
 * @author Sean A. Irvine
 */
public class A003675 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A003675() {
    super(PhysicsConstants.NEUTRON_MASS, PhysicsConstants.NEUTRON_MASS_UNC);
  }
}
