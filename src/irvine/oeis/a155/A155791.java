package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155791 Decimal expansion of log_23 (22).
 * @author Sean A. Irvine
 */
public class A155791 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.valueOf(23).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
