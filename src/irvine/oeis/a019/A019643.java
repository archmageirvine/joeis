package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019643 Decimal expansion of sqrt(2*Pi*e)/21.
 * @author Sean A. Irvine
 */
public class A019643 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(21));

  @Override
  protected CR getCR() {
    return mN;
  }
}
