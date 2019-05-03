package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019707 Decimal expansion of <code>sqrt(Pi)/5</code>.
 * @author Sean A. Irvine
 */
public class A019707 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.FIVE);

  @Override
  protected CR getCR() {
    return N;
  }
}
