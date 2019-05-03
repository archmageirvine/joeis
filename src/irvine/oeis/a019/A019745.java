package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019745 Decimal expansion of <code>e/8</code>.
 * @author Sean A. Irvine
 */
public class A019745 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(8));

  @Override
  protected CR getCR() {
    return N;
  }
}
