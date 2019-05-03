package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019656 Decimal expansion of <code>sqrt(Pi*e)/12</code>.
 * @author Sean A. Irvine
 */
public class A019656 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return mN;
  }
}
