package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019730 Decimal expansion of <code>sqrt(2*Pi)/7</code>.
 * @author Sean A. Irvine
 */
public class A019730 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt().divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
