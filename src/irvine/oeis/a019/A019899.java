package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019899 Decimal expansion of tangent of 1 degree.
 * @author Sean A. Irvine
 */
public class A019899 extends DecimalExpansionSequence {

  private final CR mN = UnaryCRFunction.TAN.execute(CR.PI.multiply(CR.valueOf(getAngle())).divide(CR.valueOf(180)));

  protected long getAngle() {
    return 1;
  }

  @Override
  protected CR getCR() {
    return mN;
  }
}
