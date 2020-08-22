package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155591 Decimal expansion of log_7(21).
 * @author Sean A. Irvine
 */
public class A155591 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
