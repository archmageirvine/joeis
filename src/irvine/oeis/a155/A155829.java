package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155829 Decimal expansion of log_9 (23).
 * @author Sean A. Irvine
 */
public class A155829 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.NINE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
