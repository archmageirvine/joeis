package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019702 Decimal expansion of <code>2*Pi/21</code>.
 * @author Sean A. Irvine
 */
public class A019702 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.valueOf(21));

  @Override
  protected CR getCR() {
    return N;
  }
}
