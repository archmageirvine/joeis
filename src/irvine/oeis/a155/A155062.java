package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155062 Decimal expansion of log_10 (19).
 * @author Sean A. Irvine
 */
public class A155062 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
