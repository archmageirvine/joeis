package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019600 Decimal expansion of 2*Pi*e/7.
 * @author Sean A. Irvine
 */
public class A019600 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).divide(CR.valueOf(7));

  @Override
  protected CR getCR() {
    return mN;
  }
}
