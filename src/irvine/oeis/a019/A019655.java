package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019655 Decimal expansion of sqrt(Pi*e)/11.
 * @author Sean A. Irvine
 */
public class A019655 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return mN;
  }
}
