package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019621 Decimal expansion of <code>Pi*e/13</code>.
 * @author Sean A. Irvine
 */
public class A019621 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(13));

  @Override
  protected CR getCR() {
    return mN;
  }
}
