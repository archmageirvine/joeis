package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019777 Decimal expansion of sqrt(e)/4.
 * @author Sean A. Irvine
 */
public class A019777 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
