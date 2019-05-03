package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010775 Decimal expansion of <code>13th</code> root of 2.
 * @author Sean A. Irvine
 */
public class A010775 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(new Q(1, 13)));

  @Override
  protected CR getCR() {
    return N;
  }
}
