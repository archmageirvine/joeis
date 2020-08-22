package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019665 Decimal expansion of sqrt(Pi*e)/21.
 * @author Sean A. Irvine
 */
public class A019665 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(21));

  @Override
  protected CR getCR() {
    return mN;
  }
}
