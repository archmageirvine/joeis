package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155735 Decimal expansion of log_7(22).
 * @author Sean A. Irvine
 */
public class A155735 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
