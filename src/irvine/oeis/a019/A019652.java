package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019652 Decimal expansion of sqrt(Pi*e)/8.
 * @author Sean A. Irvine
 */
public class A019652 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.EIGHT);

  @Override
  protected CR getCR() {
    return mN;
  }
}
