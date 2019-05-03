package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019622 Decimal expansion of <code>Pi*e/14</code>.
 * @author Sean A. Irvine
 */
public class A019622 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(14));

  @Override
  protected CR getCR() {
    return mN;
  }
}
