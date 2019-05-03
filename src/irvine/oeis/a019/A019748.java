package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019748 Decimal expansion of <code>e/11</code>.
 * @author Sean A. Irvine
 */
public class A019748 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return N;
  }
}
