package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019616 Decimal expansion of <code>Pi*e/8</code>.
 * @author Sean A. Irvine
 */
public class A019616 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.EIGHT);

  @Override
  protected CR getCR() {
    return mN;
  }
}
