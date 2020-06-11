package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019617 Decimal expansion of <code>Pi*e/9</code>.
 * @author Sean A. Irvine
 */
public class A019617 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.NINE);

  @Override
  protected CR getCR() {
    return mN;
  }
}
