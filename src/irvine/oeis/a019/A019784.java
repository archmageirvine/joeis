package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019784 Decimal expansion of <code>sqrt(e)/11</code>.
 * @author Sean A. Irvine
 */
public class A019784 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return N;
  }
}
