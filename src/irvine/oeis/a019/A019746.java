package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019746 Decimal expansion of e/9.
 * @author Sean A. Irvine
 */
public class A019746 extends DecimalExpansionSequence {

  private static final CR N = CR.E.divide(CR.NINE);

  @Override
  protected CR getCR() {
    return N;
  }
}
