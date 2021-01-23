package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154459 Decimal expansion of log_22 (13).
 * @author Sean A. Irvine
 */
public class A154459 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.valueOf(22).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
