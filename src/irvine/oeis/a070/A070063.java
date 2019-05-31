package irvine.oeis.a070;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A070063 Decimal expansion of the Boltzmann constant k in the 2019 SI system in units <code>J/K</code>.
 * @author Sean A. Irvine
 */
public class A070063 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A070063() {
    super(PhysicsConstants.BOLTZMANN, PhysicsConstants.BOLTZMANN_UNC, true);
  }
}
