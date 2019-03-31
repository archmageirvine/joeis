package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019652.
 * @author Sean A. Irvine
 */
public class A019652 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(8));

  @Override
  protected CR getCR() {
    return mN;
  }
}
