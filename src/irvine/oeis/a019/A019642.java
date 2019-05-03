package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019642 Decimal expansion of <code>sqrt(2*Pi*e)/19</code>.
 * @author Sean A. Irvine
 */
public class A019642 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(19));

  @Override
  protected CR getCR() {
    return mN;
  }
}
