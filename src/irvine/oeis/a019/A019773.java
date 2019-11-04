package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019773 Decimal expansion of <code>2*e/23</code>.
 * @author Sean A. Irvine
 */
public class A019773 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(new Q(2, 23));

  @Override
  protected CR getCR() {
    return N;
  }
}
