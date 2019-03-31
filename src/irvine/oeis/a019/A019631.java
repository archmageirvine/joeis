package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019631.
 * @author Sean A. Irvine
 */
public class A019631 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).divide(CR.valueOf(23));

  @Override
  protected CR getCR() {
    return mN;
  }
}
