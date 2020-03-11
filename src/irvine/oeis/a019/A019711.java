package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019711 Decimal expansion of <code>sqrt(Pi)/9</code>.
 * @author Sean A. Irvine
 */
public class A019711 extends DecimalExpansionSequence {

  private static final CR N = CR.SQRT_PI.divide(CR.valueOf(9));

  @Override
  protected CR getCR() {
    return N;
  }
}
