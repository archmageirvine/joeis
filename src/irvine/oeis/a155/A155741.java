package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155741 Decimal expansion of log_8 (22).
 * @author Sean A. Irvine
 */
public class A155741 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.valueOf(8).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
