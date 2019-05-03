package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019701 Decimal expansion of <code>2*Pi/19</code>.
 * @author Sean A. Irvine
 */
public class A019701 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.valueOf(19));

  @Override
  protected CR getCR() {
    return N;
  }
}
