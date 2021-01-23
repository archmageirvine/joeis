package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A007524 Decimal expansion of log_10 2.
 * @author Sean A. Irvine
 */
public class A007524 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.log().divide(CR.TEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
