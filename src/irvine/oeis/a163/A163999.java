package irvine.oeis.a163;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A163999 Decimal expansion of the Faraday constant according to the 2019 SI system.
 * @author Sean A. Irvine
 */
public class A163999 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A163999() {
    super(PhysicsConstants.FARADAY, PhysicsConstants.FARADAY_UNC, true);
  }
}
