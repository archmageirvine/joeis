package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019766 Decimal expansion of <code>2*e/9</code>.
 * @author Sean A. Irvine
 */
public class A019766 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.valueOf(new Q(2, 9)));

  @Override
  protected CR getCR() {
    return N;
  }
}
