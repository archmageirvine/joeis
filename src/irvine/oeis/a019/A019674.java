package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019674 Decimal expansion of Pi/7.
 * @author Sean A. Irvine
 */
public class A019674 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(7));

  @Override
  protected CR getCR() {
    return N;
  }
}
