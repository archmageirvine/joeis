package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019744 Decimal expansion of e/7.
 * @author Sean A. Irvine
 */
public class A019744 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
