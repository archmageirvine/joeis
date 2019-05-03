package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155921 Decimal expansion of <code>log_2(24) = 3+log_2(3)</code>.
 * @author Sean A. Irvine
 */
public class A155921 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
