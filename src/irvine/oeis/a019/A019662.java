package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019662.
 * @author Sean A. Irvine
 */
public class A019662 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt().divide(CR.valueOf(18));

  @Override
  protected CR getCR() {
    return mN;
  }
}
