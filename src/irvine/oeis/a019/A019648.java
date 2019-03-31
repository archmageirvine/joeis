package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019648.
 * @author Sean A. Irvine
 */
public class A019648 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return mN;
  }
}
