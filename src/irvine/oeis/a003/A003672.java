package irvine.oeis.a003;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A003672.
 * @author Sean A. Irvine
 */
public class A003672 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A003672() {
    super(PhysicsConstants.ELECTRON_MASS, PhysicsConstants.ELECTRON_MASS_UNC);
  }
}
