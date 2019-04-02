package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019650 Decimal expansion of sqrt(Pi*e)/6.
 * @author Sean A. Irvine
 */
public class A019650 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(6));

  @Override
  protected CR getCR() {
    return mN;
  }
}
