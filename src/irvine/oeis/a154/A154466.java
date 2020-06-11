package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154466 Decimal expansion of <code>log_6 (14)</code>.
 * @author Sean A. Irvine
 */
public class A154466 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.SIX.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
