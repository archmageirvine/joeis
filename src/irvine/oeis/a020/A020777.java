package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020777 Decimal expansion of <code>(-1)*Gamma'(1/4)/Gamma(1/4)</code> where <code>Gamma(x)</code> denotes the Gamma function.
 * @author Sean A. Irvine
 */
public class A020777 extends DecimalExpansionSequence {

  private static final CR N = EulerGamma.SINGLETON.add(CR.TWO.log().multiply(CR.THREE)).add(CR.HALF_PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
