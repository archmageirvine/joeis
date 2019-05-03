package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019807 Decimal expansion of <code>sqrt(2*e)/19</code>.
 * @author Sean A. Irvine
 */
public class A019807 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(19));

  @Override
  protected CR getCR() {
    return N;
  }
}
