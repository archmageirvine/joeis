package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019744 Decimal expansion of <code>e/7</code>.
 * @author Sean A. Irvine
 */
public class A019744 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(7));

  @Override
  protected CR getCR() {
    return N;
  }
}
