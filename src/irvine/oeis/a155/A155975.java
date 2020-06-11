package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155975 Decimal expansion of <code>log_8 (24)</code>.
 * @author Sean A. Irvine
 */
public class A155975 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.EIGHT.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
