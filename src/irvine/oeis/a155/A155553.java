package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155553 Decimal expansion of log_5 <code>(21)</code>.
 * @author Sean A. Irvine
 */
public class A155553 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
