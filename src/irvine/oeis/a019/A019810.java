package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019810.
 * @author Sean A. Irvine
 */
public class A019810 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.valueOf(getAngle())).divide(CR.valueOf(180)).sin();

  protected long getAngle() {
    return 1;
  }

  @Override
  protected CR getCR() {
    return mN;
  }
}
