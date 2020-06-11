package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019695 Decimal expansion of <code>2*Pi/7</code>.
 * @author Sean A. Irvine
 */
public class A019695 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.SEVEN);

  @Override
  protected CR getCR() {
    return N;
  }
}
