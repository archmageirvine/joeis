package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019787 Decimal expansion of <code>sqrt(e)/14</code>.
 * @author Sean A. Irvine
 */
public class A019787 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(14));

  @Override
  protected CR getCR() {
    return N;
  }
}
