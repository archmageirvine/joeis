package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154857 Decimal expansion of log_7(17).
 * @author Sean A. Irvine
 */
public class A154857 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
