package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154858 Decimal expansion of log_8 (17).
 * @author Sean A. Irvine
 */
public class A154858 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
