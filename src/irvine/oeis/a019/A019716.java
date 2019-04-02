package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019716 Decimal expansion of sqrt(Pi)/14.
 * @author Sean A. Irvine
 */
public class A019716 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.valueOf(14));

  @Override
  protected CR getCR() {
    return N;
  }
}
