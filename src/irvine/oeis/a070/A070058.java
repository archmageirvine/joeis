package irvine.oeis.a070;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.cons.DoubleDecimalExpansionSequence;

/**
 * A070058 Decimal expansion of Newton's gravitational constant in SI units.
 * @author Sean A. Irvine
 */
public class A070058 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A070058() {
    super(-10, PhysicsConstants.GRAVITATION_CONSTANT, PhysicsConstants.GRAVITATION_CONSTANT_UNC, true);
  }
}
