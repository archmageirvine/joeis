package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154491 Decimal expansion of log_19 (14).
 * @author Sean A. Irvine
 */
public class A154491 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(14).log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
