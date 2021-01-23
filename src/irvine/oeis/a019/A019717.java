package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019717 Decimal expansion of sqrt(Pi)/15.
 * @author Sean A. Irvine
 */
public class A019717 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.valueOf(15));

  @Override
  protected CR getCR() {
    return N;
  }
}
