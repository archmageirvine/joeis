package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019612.
 * @author Sean A. Irvine
 */
public class A019612 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return mN;
  }
}
