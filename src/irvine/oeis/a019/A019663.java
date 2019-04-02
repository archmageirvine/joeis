package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019663 Decimal expansion of sqrt(Pi*e)/19.
 * @author Sean A. Irvine
 */
public class A019663 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(19));

  @Override
  protected CR getCR() {
    return mN;
  }
}
