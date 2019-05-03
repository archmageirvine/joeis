package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019661 Decimal expansion of <code>sqrt(Pi*e)/17</code>.
 * @author Sean A. Irvine
 */
public class A019661 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(17));

  @Override
  protected CR getCR() {
    return mN;
  }
}
