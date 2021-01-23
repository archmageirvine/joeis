package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019775 Decimal expansion of sqrt(e)/2.
 * @author Sean A. Irvine
 */
public class A019775 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
