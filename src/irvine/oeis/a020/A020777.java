package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020777 Decimal expansion of (-1)*Gamma'(1/4)/Gamma(1/4) where Gamma(x) denotes the Gamma function.
 * @author Sean A. Irvine
 */
public class A020777 extends DecimalExpansionSequence {

  private static final CR N = CR.GAMMA.add(CR.TWO.log().multiply(CR.THREE)).add(CR.HALF_PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
