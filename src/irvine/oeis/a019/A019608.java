package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019608 Decimal expansion of 2*Pi*e/23.
 * @author Sean A. Irvine
 */
public class A019608 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).divide(CR.valueOf(23));

  @Override
  protected CR getCR() {
    return mN;
  }
}
