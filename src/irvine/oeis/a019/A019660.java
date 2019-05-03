package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019660 Decimal expansion of <code>sqrt(Pi*e)/16</code>.
 * @author Sean A. Irvine
 */
public class A019660 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(16));

  @Override
  protected CR getCR() {
    return mN;
  }
}
