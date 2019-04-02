package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019768 Decimal expansion of 2*e/13.
 * @author Sean A. Irvine
 */
public class A019768 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.valueOf(new Q(2, 13)));

  @Override
  protected CR getCR() {
    return N;
  }
}
