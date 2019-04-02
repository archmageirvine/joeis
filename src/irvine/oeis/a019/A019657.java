package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019657 Decimal expansion of sqrt(Pi*e)/13.
 * @author Sean A. Irvine
 */
public class A019657 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(13));

  @Override
  protected CR getCR() {
    return mN;
  }
}
