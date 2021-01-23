package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019668 Decimal expansion of sqrt(Pi*e)/24.
 * @author Sean A. Irvine
 */
public class A019668 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(24));

  @Override
  protected CR getCR() {
    return mN;
  }
}
