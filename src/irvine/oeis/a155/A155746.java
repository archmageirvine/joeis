package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155746 Decimal expansion of log_10 (22).
 * @author Sean A. Irvine
 */
public class A155746 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
