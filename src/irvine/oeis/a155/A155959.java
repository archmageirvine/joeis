package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155959 Decimal expansion of log_6 (24).
 * @author Sean A. Irvine
 */
public class A155959 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
