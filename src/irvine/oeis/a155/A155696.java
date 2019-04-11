package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155696 Decimal expansion of log_5 <code>(22)</code>.
 * @author Sean A. Irvine
 */
public class A155696 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
