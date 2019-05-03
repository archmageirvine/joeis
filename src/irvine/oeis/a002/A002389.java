package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.EulerGamma;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002389 Decimal expansion of <code>-log(gamma)</code>, where gamma is Euler's constant <code>A001620</code>.
 * @author Sean A. Irvine
 */
public class A002389 extends DecimalExpansionSequence {

  private static final CR N = EulerGamma.SINGLETON.log().negate();

  @Override
  protected CR getCR() {
    return N;
  }
}
