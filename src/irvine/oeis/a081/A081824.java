package irvine.oeis.a081;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A081824 Decimal expansion of conductance quantum in units of S.
 * @author Sean A. Irvine
 */
public class A081824 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A081824() {
    super(PhysicsConstants.CONDUCTANCE_QUANTUM, PhysicsConstants.CONDUCTANCE_QUANTUM_UNC, true);
  }
}
