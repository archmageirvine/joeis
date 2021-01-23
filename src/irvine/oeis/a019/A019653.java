package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019653 Decimal expansion of sqrt(Pi*e)/9.
 * @author Sean A. Irvine
 */
public class A019653 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.NINE);

  @Override
  protected CR getCR() {
    return mN;
  }
}
