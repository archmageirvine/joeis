package irvine.oeis.a090;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A090986 Decimal expansion of <code>Pi/sinh(Pi)</code>.
 * @author Sean A. Irvine
 */
public class A090986 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = CR.PI.divide(REALS.sinh(CR.PI));

  @Override
  protected CR getCR() {
    return N;
  }
}
