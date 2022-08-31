package irvine.oeis.a254;

import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A254181 Decimal expansion of reduced Planck constant (in joule seconds).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A254181 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A254181() {
    super(1, PhysicsConstants.HBAR_CR.multiply(Z.TEN.pow(33)));
  }

  @Override
  public int getOffset() {
    return -33;
  }
}
