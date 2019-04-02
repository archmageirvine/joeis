package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019751 Decimal expansion of e/14.
 * @author Sean A. Irvine
 */
public class A019751 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(14));

  @Override
  protected CR getCR() {
    return N;
  }
}
