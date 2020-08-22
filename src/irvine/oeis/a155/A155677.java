package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155677 Decimal expansion of log_10 (21).
 * @author Sean A. Irvine
 */
public class A155677 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
