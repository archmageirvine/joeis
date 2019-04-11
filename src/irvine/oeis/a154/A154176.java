package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154176 Decimal expansion of log_4 <code>(11)</code>.
 * @author Sean A. Irvine
 */
public class A154176 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
