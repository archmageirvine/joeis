package irvine.oeis.a070;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A070064 Decimal expansion of the molar gas constant R.
 * @author Sean A. Irvine
 */
public class A070064 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A070064() {
    super(PhysicsConstants.MOLAR_GAS, PhysicsConstants.MOLAR_GAS_UNC);
  }
}
