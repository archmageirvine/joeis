package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154574 Decimal expansion of log_8 (15).
 * @author Sean A. Irvine
 */
public class A154574 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
