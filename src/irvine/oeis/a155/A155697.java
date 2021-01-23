package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155697 Decimal expansion of log_6 (22).
 * @author Sean A. Irvine
 */
public class A155697 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
