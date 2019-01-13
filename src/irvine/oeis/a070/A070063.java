package irvine.oeis.a070;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A070063.
 * @author Sean A. Irvine
 */
public class A070063 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A070063() {
    super(PhysicsConstants.BOLTZMANN, PhysicsConstants.BOLTZMANN_UNC, true);
  }
}
