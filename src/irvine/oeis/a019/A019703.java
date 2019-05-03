package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019703 Decimal expansion of <code>2*Pi/23</code>.
 * @author Sean A. Irvine
 */
public class A019703 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.valueOf(23));

  @Override
  protected CR getCR() {
    return N;
  }
}
