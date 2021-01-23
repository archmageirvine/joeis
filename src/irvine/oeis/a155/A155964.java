package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155964 Decimal expansion of log_7(24).
 * @author Sean A. Irvine
 */
public class A155964 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
