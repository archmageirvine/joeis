package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155545 Decimal expansion of log_4 <code>(21)</code>.
 * @author Sean A. Irvine
 */
public class A155545 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(21).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
