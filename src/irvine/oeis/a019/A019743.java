package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019743 Decimal expansion of <code>e/6</code>.
 * @author Sean A. Irvine
 */
public class A019743 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(6));

  @Override
  protected CR getCR() {
    return N;
  }
}
