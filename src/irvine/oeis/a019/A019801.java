package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019801 Decimal expansion of <code>sqrt(2*e)/7</code>.
 * @author Sean A. Irvine
 */
public class A019801 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt().divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
