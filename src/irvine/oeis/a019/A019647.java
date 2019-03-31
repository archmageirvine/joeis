package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019647.
 * @author Sean A. Irvine
 */
public class A019647 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.THREE);

  @Override
  protected CR getCR() {
    return mN;
  }
}
