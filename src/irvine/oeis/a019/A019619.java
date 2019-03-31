package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019619.
 * @author Sean A. Irvine
 */
public class A019619 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return mN;
  }
}
