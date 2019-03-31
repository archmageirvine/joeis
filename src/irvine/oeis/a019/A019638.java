package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019638.
 * @author Sean A. Irvine
 */
public class A019638 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).sqrt().divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return mN;
  }
}
