package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019718 Decimal expansion of sqrt(Pi)/16.
 * @author Sean A. Irvine
 */
public class A019718 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.valueOf(16));

  @Override
  protected CR getCR() {
    return N;
  }
}
