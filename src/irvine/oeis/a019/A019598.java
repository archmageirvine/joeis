package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019598 Decimal expansion of <code>2*Pi*e/3</code>.
 * @author Sean A. Irvine
 */
public class A019598 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).divide(CR.THREE);

  @Override
  protected CR getCR() {
    return mN;
  }
}
