package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019710 Decimal expansion of <code>sqrt(Pi)/8</code>.
 * @author Sean A. Irvine
 */
public class A019710 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.EIGHT);

  @Override
  protected CR getCR() {
    return N;
  }
}
