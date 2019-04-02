package irvine.oeis.a248;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A248507 Decimal expansion of a single magnetic flux quantum in SI units.
 * @author Sean A. Irvine
 */
public class A248507 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A248507() {
    super(PhysicsConstants.MAGNETIC_FLUX_QUANTUM, PhysicsConstants.MAGNETIC_FLUX_QUANTUM_UNC, true);
  }
}
