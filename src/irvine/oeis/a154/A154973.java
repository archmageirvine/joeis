package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154973 Decimal expansion of log_16 (18).
 * @author Sean A. Irvine
 */
public class A154973 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.valueOf(16).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
