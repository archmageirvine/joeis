package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019808 Decimal expansion of sqrt(2*e)/21.
 * @author Sean A. Irvine
 */
public class A019808 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.TWO).sqrt().divide(CR.valueOf(21));

  @Override
  protected CR getCR() {
    return N;
  }
}
