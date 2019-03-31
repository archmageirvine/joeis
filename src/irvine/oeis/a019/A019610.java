package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019610.
 * @author Sean A. Irvine
 */
public class A019610 extends DecimalExpansionSequence {

  private final CR mN = CR.HALF_PI.multiply(CR.E);

  @Override
  protected CR getCR() {
    return mN;
  }
}
