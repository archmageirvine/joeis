package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019745 Decimal expansion of e/8.
 * @author Sean A. Irvine
 */
public class A019745 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.EIGHT);

  @Override
  protected CR getCR() {
    return N;
  }
}
