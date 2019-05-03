package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019666 Decimal expansion of <code>sqrt(Pi*e)/22</code>.
 * @author Sean A. Irvine
 */
public class A019666 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(22));

  @Override
  protected CR getCR() {
    return mN;
  }
}
