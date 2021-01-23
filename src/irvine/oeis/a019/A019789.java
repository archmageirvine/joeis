package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019789 Decimal expansion of sqrt(e)/16.
 * @author Sean A. Irvine
 */
public class A019789 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(16));

  @Override
  protected CR getCR() {
    return N;
  }
}
