package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019617.
 * @author Sean A. Irvine
 */
public class A019617 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(9));

  @Override
  protected CR getCR() {
    return mN;
  }
}
