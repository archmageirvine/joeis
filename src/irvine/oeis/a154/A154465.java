package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154465 Decimal expansion of <code>log_5 (14)</code>.
 * @author Sean A. Irvine
 */
public class A154465 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
