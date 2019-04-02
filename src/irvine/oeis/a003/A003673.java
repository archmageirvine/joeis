package irvine.oeis.a003;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A003673 Decimal expansion of fine-structure constant alpha.
 * @author Sean A. Irvine
 */
public class A003673 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A003673() {
    super(PhysicsConstants.FINE_STRUCTURE_CONSTANT, PhysicsConstants.FINE_STRUCTURE_CONSTANT_UNC);
  }
}
