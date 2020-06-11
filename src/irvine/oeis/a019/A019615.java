package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019615 Decimal expansion of <code>Pi*e/7</code>.
 * @author Sean A. Irvine
 */
public class A019615 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return mN;
  }
}
