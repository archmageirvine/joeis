package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019750 Decimal expansion of e/13.
 * @author Sean A. Irvine
 */
public class A019750 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.valueOf(13));

  @Override
  protected CR getCR() {
    return N;
  }
}
