package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019635 Decimal expansion of sqrt(2*Pi*e)/5.
 * @author Sean A. Irvine
 */
public class A019635 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).sqrt().divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return mN;
  }
}
