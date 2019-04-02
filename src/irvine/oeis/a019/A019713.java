package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019713 Decimal expansion of sqrt(Pi)/11.
 * @author Sean A. Irvine
 */
public class A019713 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return N;
  }
}
