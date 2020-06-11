package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154163 Decimal expansion of <code>log_13 (10)</code>.
 * @author Sean A. Irvine
 */
public class A154163 extends DecimalExpansionSequence {

  private static final CR N = CR.TEN.log().divide(CR.valueOf(13).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
