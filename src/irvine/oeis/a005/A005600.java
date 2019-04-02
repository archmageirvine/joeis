package irvine.oeis.a005;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A005600 Decimal expansion of reciprocal of fine-structure constant alpha.
 * @author Sean A. Irvine
 */
public class A005600 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A005600() {
    super(1 / PhysicsConstants.FINE_STRUCTURE_CONSTANT, PhysicsConstants.FINE_STRUCTURE_CONSTANT_UNC / PhysicsConstants.FINE_STRUCTURE_CONSTANT / PhysicsConstants.FINE_STRUCTURE_CONSTANT);
  }
}
