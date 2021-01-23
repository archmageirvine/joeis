package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155979 Decimal expansion of log_10 (24).
 * @author Sean A. Irvine
 */
public class A155979 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
