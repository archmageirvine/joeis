package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019627 Decimal expansion of Pi*e/19.
 * @author Sean A. Irvine
 */
public class A019627 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(19));

  @Override
  protected CR getCR() {
    return mN;
  }
}
