package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019637 Decimal expansion of <code>sqrt(2*Pi*e)/9</code>.
 * @author Sean A. Irvine
 */
public class A019637 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).sqrt().divide(CR.NINE);

  @Override
  protected CR getCR() {
    return mN;
  }
}
