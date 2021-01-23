package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155496 Decimal expansion of log_7(20).
 * @author Sean A. Irvine
 */
public class A155496 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20).log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
