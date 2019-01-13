package irvine.oeis.a070;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A070058.
 * @author Sean A. Irvine
 */
public class A070058 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A070058() {
    super(PhysicsConstants.GRAVITATION_CONSTANT, PhysicsConstants.GRAVITATION_CONSTANT_UNC, true);
  }
}
