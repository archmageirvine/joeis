package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019771 Decimal expansion of <code>2*e/19</code>.
 * @author Sean A. Irvine
 */
public class A019771 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(new Q(2, 19));

  @Override
  protected CR getCR() {
    return N;
  }
}
