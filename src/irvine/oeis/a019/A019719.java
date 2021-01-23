package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019719 Decimal expansion of sqrt(Pi)/17.
 * @author Sean A. Irvine
 */
public class A019719 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.valueOf(17));

  @Override
  protected CR getCR() {
    return N;
  }
}
