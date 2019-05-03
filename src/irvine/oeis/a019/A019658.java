package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019658 Decimal expansion of <code>sqrt(Pi*e)/14</code>.
 * @author Sean A. Irvine
 */
public class A019658 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(14));

  @Override
  protected CR getCR() {
    return mN;
  }
}
