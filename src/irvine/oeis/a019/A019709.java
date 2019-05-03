package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019709 Decimal expansion of <code>sqrt(Pi)/7</code>.
 * @author Sean A. Irvine
 */
public class A019709 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.valueOf(7));

  @Override
  protected CR getCR() {
    return N;
  }
}
