package irvine.oeis.a003;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A003671.
 * @author Sean A. Irvine
 */
public class A003671 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A003671() {
    super(PhysicsConstants.BOHR_RADIUS, PhysicsConstants.BOHR_RADIUS_UNC);
  }
}
