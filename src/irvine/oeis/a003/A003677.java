package irvine.oeis.a003;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A003677 Decimal expansion of proton mass <code>(mass units)</code>.
 * @author Sean A. Irvine
 */
public class A003677 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A003677() {
    super(PhysicsConstants.PROTON_MASS, PhysicsConstants.PROTON_MASS_UNC);
  }
}
