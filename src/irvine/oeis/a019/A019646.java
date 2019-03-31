package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019646.
 * @author Sean A. Irvine
 */
public class A019646 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.TWO);

  @Override
  protected CR getCR() {
    return mN;
  }
}
