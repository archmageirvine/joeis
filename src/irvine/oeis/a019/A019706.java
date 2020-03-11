package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019706 Decimal expansion of <code>sqrt(Pi)/4</code>.
 * @author Sean A. Irvine
 */
public class A019706 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
