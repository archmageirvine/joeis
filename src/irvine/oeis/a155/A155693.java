package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155693 Decimal expansion of log_2 <code>(22)</code>.
 * @author Sean A. Irvine
 */
public class A155693 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
