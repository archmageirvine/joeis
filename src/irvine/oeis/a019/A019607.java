package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019607 Decimal expansion of 2*Pi*e/21.
 * @author Sean A. Irvine
 */
public class A019607 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).divide(CR.valueOf(21));

  @Override
  protected CR getCR() {
    return mN;
  }
}
