package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154278 Decimal expansion of log_6 (13).
 * @author Sean A. Irvine
 */
public class A154278 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
