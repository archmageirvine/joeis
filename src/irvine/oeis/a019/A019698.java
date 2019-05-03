package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019698 Decimal expansion of <code>2*Pi/13</code>.
 * @author Sean A. Irvine
 */
public class A019698 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.valueOf(13));

  @Override
  protected CR getCR() {
    return N;
  }
}
