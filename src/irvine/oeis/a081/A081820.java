package irvine.oeis.a081;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A081820.
 * @author Sean A. Irvine
 */
public class A081820 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A081820() {
    super(PhysicsConstants.STEFAN_BOLTZMANN, PhysicsConstants.STEFAN_BOLTZMANN_UNC, true);
  }
}
