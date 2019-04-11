package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154847 Decimal expansion of log_2 <code>(17)</code>.
 * @author Sean A. Irvine
 */
public class A154847 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
