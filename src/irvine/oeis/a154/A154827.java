package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154827 Decimal expansion of log_17 (16).
 * @author Sean A. Irvine
 */
public class A154827 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(16).log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
