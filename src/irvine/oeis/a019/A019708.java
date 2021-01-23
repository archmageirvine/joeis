package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019708 Decimal expansion of sqrt(Pi)/6.
 * @author Sean A. Irvine
 */
public class A019708 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.SIX);

  @Override
  protected CR getCR() {
    return N;
  }
}
