package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019767 Decimal expansion of 2*e/11.
 * @author Sean A. Irvine
 */
public class A019767 extends DecimalExpansionSequence {

  private static final CR N = CR.E.multiply(CR.valueOf(new Q(2, 11)));

  @Override
  protected CR getCR() {
    return N;
  }
}
