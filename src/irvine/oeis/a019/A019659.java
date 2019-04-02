package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019659 Decimal expansion of sqrt(Pi*e)/15.
 * @author Sean A. Irvine
 */
public class A019659 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(15));

  @Override
  protected CR getCR() {
    return mN;
  }
}
