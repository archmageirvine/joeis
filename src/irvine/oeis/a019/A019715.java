package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019715 Decimal expansion of sqrt(Pi)/13.
 * @author Sean A. Irvine
 */
public class A019715 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.valueOf(13));

  @Override
  protected CR getCR() {
    return N;
  }
}
