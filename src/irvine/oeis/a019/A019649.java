package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019649.
 * @author Sean A. Irvine
 */
public class A019649 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return mN;
  }
}
