package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154294 Decimal expansion of log_7(13).
 * @author Sean A. Irvine
 */
public class A154294 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.valueOf(7).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
