package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019732 Decimal expansion of sqrt(2*Pi)/11.
 * @author Sean A. Irvine
 */
public class A019732 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt().divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return N;
  }
}
