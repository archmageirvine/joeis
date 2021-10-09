package irvine.oeis.a254;

import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A254181 Decimal expansion of reduced Planck constant (in joule seconds).
 * @author Sean A. Irvine
 */
public class A254181 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A254181() {
    super(PhysicsConstants.HBAR_CR.multiply(Z.TEN.pow(33)));
  }
}
