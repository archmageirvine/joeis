package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154467 Decimal expansion of <code>log_7(14)</code>.
 * @author Sean A. Irvine
 */
public class A154467 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
