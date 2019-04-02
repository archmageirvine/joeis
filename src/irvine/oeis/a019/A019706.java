package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019706 Decimal expansion of sqrt(Pi)/4.
 * @author Sean A. Irvine
 */
public class A019706 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.FOUR);

  @Override
  protected CR getCR() {
    return N;
  }
}
