package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019630.
 * @author Sean A. Irvine
 */
public class A019630 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(22));

  @Override
  protected CR getCR() {
    return mN;
  }
}
