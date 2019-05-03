package irvine.oeis.a003;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A003676 Decimal expansion of the Planck constant h (Joule <code>*</code> second).
 * @author Sean A. Irvine
 */
public class A003676 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A003676() {
    super(PhysicsConstants.PLANCK_CONSTANT, PhysicsConstants.PLANCK_CONSTANT_UNC, true);
  }
}
