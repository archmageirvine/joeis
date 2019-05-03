package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019700 Decimal expansion of <code>2*Pi/17</code>.
 * @author Sean A. Irvine
 */
public class A019700 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.valueOf(17));

  @Override
  protected CR getCR() {
    return N;
  }
}
