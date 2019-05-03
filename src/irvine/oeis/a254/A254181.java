package irvine.oeis.a254;

import irvine.math.r.PhysicsConstants;
import irvine.oeis.DoubleDecimalExpansionSequence;

/**
 * A254181 Decimal expansion of reduced Planck constant (in joule <code>seconds)</code>.
 * @author Sean A. Irvine
 */
public class A254181 extends DoubleDecimalExpansionSequence {

  /** Construct the sequence. */
  public A254181() {
    super(PhysicsConstants.HBAR, PhysicsConstants.HBAR_UNC, true);
  }
}
