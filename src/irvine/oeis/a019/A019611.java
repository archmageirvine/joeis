package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019611 Decimal expansion of Pi*e/3.
 * @author Sean A. Irvine
 */
public class A019611 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.THREE);

  @Override
  protected CR getCR() {
    return mN;
  }
}
