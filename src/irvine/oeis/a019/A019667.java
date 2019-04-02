package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019667 Decimal expansion of sqrt(Pi*e)/23.
 * @author Sean A. Irvine
 */
public class A019667 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(23));

  @Override
  protected CR getCR() {
    return mN;
  }
}
