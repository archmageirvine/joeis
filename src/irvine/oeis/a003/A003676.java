package irvine.oeis.a003;

import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A003676 Decimal expansion of the Planck constant h (Joule * second).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A003676 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A003676() {
    super(1, PhysicsConstants.PLANCK_CONSTANT_CR.multiply(Z.TEN.pow(33)));
  }

  @Override
  public int getOffset() {
    return -33;
  }
}
