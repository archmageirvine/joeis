package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019651 Decimal expansion of <code>sqrt(Pi*e)/7</code>.
 * @author Sean A. Irvine
 */
public class A019651 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return mN;
  }
}
