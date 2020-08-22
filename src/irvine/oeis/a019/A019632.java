package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019632 Decimal expansion of Pi*e/24.
 * @author Sean A. Irvine
 */
public class A019632 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(24));

  @Override
  protected CR getCR() {
    return mN;
  }
}
