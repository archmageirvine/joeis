package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019599 Decimal expansion of <code>2*Pi*e/5</code>.
 * @author Sean A. Irvine
 */
public class A019599 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return mN;
  }
}
