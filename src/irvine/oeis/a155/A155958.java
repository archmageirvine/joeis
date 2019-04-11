package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155958 Decimal expansion of log_5 <code>(24)</code>.
 * @author Sean A. Irvine
 */
public class A155958 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
