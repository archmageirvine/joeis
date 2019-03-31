package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019603.
 * @author Sean A. Irvine
 */
public class A019603 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).divide(CR.valueOf(13));

  @Override
  protected CR getCR() {
    return mN;
  }
}
