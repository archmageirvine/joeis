package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019629.
 * @author Sean A. Irvine
 */
public class A019629 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(21));

  @Override
  protected CR getCR() {
    return mN;
  }
}
