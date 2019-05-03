package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019605 Decimal expansion of <code>2*Pi*e/17</code>.
 * @author Sean A. Irvine
 */
public class A019605 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).divide(CR.valueOf(17));

  @Override
  protected CR getCR() {
    return mN;
  }
}
