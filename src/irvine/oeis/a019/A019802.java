package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019802 Decimal expansion of sqrt(2*e)/9.
 * @author Sean A. Irvine
 */
public class A019802 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(9));

  @Override
  protected CR getCR() {
    return N;
  }
}
