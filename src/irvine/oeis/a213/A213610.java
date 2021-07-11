package irvine.oeis.a213;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A213610 Decimal expansion of the characteristic impedance of vacuum in SI units as defined before 20 May 2019.
 * @author Sean A. Irvine
 */
public class A213610 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A213610() {
    super(CR.TAU.multiply(CR.TWO).multiply(PhysicsConstants.SPEED_OF_LIGHT));
  }
}
