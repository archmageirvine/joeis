package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A081799 Decimal expansion of the electric permittivity of vacuum in SI units.
 * @author Sean A. Irvine
 */
public class A081799 extends DecimalExpansionSequence {

  private static final CR LIGHT_SPEED_SQUARED = CR.valueOf(Z.valueOf(PhysicsConstants.SPEED_OF_LIGHT).square());
  private static final CR N = CR.TAU.multiply(CR.TWO).multiply(LIGHT_SPEED_SQUARED).inverse();

  @Override
  protected CR getCR() {
    return N;
  }

  /** Construct the sequence. */
  public A081799() {
    super(false);
  }
}
