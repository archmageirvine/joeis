package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019780 Decimal expansion of sqrt(e)/7.
 * @author Sean A. Irvine
 */
public class A019780 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
