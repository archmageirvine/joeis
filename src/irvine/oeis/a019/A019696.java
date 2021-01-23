package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019696 Decimal expansion of 2*Pi/9.
 * @author Sean A. Irvine
 */
public class A019696 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.NINE);

  @Override
  protected CR getCR() {
    return N;
  }
}
