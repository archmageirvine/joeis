package irvine.oeis.a081;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.cons.DoubleDecimalExpansionSequence;

/**
 * A081821 Rydberg constant, in inverse meters.
 * @author Sean A. Irvine
 */
public class A081821 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A081821() {
    super(PhysicsConstants.RYDBERG, PhysicsConstants.RYDBERG_UNC);
  }
}
