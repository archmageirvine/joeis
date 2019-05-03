package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019739 Decimal expansion of <code>e/2</code>.
 * @author Sean A. Irvine
 */
public class A019739 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
