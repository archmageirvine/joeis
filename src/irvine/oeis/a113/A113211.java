package irvine.oeis.a113;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A113211 Decimal expansion of (2 * log(3))/log(7).
 * @author Sean A. Irvine
 */
public class A113211 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.log().divide(CR.SEVEN.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
