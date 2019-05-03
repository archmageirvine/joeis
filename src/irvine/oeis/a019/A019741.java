package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019741 Decimal expansion of <code>e/4</code>.
 * @author Sean A. Irvine
 */
public class A019741 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
