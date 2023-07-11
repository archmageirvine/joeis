package irvine.oeis.a003;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.cons.DoubleDecimalExpansionSequence;

/**
 * A003672 Decimal expansion of electron mass (mass units).
 * @author Sean A. Irvine
 */
public class A003672 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A003672() {
    super(0, PhysicsConstants.ELECTRON_MASS, PhysicsConstants.ELECTRON_MASS_UNC);
  }
}
