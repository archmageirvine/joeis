package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155184 Decimal expansion of <code>log_5 (20)</code>.
 * @author Sean A. Irvine
 */
public class A155184 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
