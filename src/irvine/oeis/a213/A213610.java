package irvine.oeis.a213;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A213610 Decimal expansion of the characteristic impedance of vacuum in SI units.
 * @author Sean A. Irvine
 */
public class A213610 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.multiply(CR.TWO).multiply(CR.valueOf(PhysicsConstants.SPEED_OF_LIGHT));

  @Override
  protected CR getCR() {
    return N;
  }

  /** Construct the sequence. */
  public A213610() {
    super(false);
  }
}
