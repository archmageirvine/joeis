package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019602 Decimal expansion of 2*Pi*e/11.
 * @author Sean A. Irvine
 */
public class A019602 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return mN;
  }
}
