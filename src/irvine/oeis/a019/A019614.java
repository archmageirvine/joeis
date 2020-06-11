package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019614 Decimal expansion of <code>Pi*e/6</code>.
 * @author Sean A. Irvine
 */
public class A019614 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.SIX);

  @Override
  protected CR getCR() {
    return mN;
  }
}
