package irvine.oeis.a308;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A308718 Decimal expansion of <code>Pi*sech(Pi/2)/2</code>.
 * @author Sean A. Irvine
 */
public class A308718 extends DecimalExpansionSequence {

  private static final CR N = CR.HALF_PI.multiply(ComputableReals.SINGLETON.sech(CR.HALF_PI));

  @Override
  protected CR getCR() {
    return N;
  }
}
