package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019756 Decimal expansion of <code>e/19</code>.
 * @author Sean A. Irvine
 */
public class A019756 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(19));

  @Override
  protected CR getCR() {
    return N;
  }
}
