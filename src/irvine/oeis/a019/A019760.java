package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019760 Decimal expansion of <code>e/23</code>.
 * @author Sean A. Irvine
 */
public class A019760 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(23));

  @Override
  protected CR getCR() {
    return N;
  }
}
