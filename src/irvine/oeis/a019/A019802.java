package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019802 Decimal expansion of <code>sqrt(2*e)/9</code>.
 * @author Sean A. Irvine
 */
public class A019802 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt().divide(CR.NINE);

  @Override
  protected CR getCR() {
    return N;
  }
}
