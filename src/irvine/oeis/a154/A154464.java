package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154464 Decimal expansion of log_4 <code>(14)</code>.
 * @author Sean A. Irvine
 */
public class A154464 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
