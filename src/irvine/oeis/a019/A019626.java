package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019626 Decimal expansion of Pi*e/18.
 * @author Sean A. Irvine
 */
public class A019626 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(18));

  @Override
  protected CR getCR() {
    return mN;
  }
}
