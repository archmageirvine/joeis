package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019644 Decimal expansion of sqrt(2*Pi*e)/23.
 * @author Sean A. Irvine
 */
public class A019644 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(23));

  @Override
  protected CR getCR() {
    return mN;
  }
}
