package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019733 Decimal expansion of sqrt(2*Pi)/13.
 * @author Sean A. Irvine
 */
public class A019733 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt().divide(CR.valueOf(13));

  @Override
  protected CR getCR() {
    return N;
  }
}
