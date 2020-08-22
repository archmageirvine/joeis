package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154179 Decimal expansion of log_7(11).
 * @author Sean A. Irvine
 */
public class A154179 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
