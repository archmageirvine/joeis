package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019699 Decimal expansion of <code>2*Pi/15 = (4*Pi/3)/10</code>.
 * @author Sean A. Irvine
 */
public class A019699 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.valueOf(15));

  @Override
  protected CR getCR() {
    return N;
  }
}
