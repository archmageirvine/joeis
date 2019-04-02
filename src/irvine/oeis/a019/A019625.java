package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019625 Decimal expansion of Pi*e/17.
 * @author Sean A. Irvine
 */
public class A019625 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(17));

  @Override
  protected CR getCR() {
    return mN;
  }
}
