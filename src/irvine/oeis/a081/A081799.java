package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.r.PhysicsConstants;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A081799 Decimal expansion of the electric permittivity of vacuum in SI units as defined before 20 May 2019.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A081799 extends DecimalExpansionSequence {

  private static final CR LIGHT_SPEED_SQUARED = CR.valueOf(Z.valueOf(PhysicsConstants.SPEED_OF_LIGHT).square());

  /** Construct the sequence. */
  public A081799() {
    super(-18, CR.TAU.multiply(CR.TWO).multiply(LIGHT_SPEED_SQUARED).inverse());
  }

  @Override
  public int getOffset() {
    return -11;
  }
}
