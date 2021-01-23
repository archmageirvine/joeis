package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154490 Decimal expansion of log_18 (14).
 * @author Sean A. Irvine
 */
public class A154490 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.valueOf(18).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
