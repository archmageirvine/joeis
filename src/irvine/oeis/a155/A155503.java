package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155503 Decimal expansion of log_9 (20).
 * @author Sean A. Irvine
 */
public class A155503 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20).log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
