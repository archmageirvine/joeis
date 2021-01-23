package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154482 Decimal expansion of log_15 (14).
 * @author Sean A. Irvine
 */
public class A154482 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.valueOf(15).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
