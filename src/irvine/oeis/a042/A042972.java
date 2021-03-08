package irvine.oeis.a042;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A042972 Decimal expansion of i^(-i), where i = sqrt(-1).
 * @author Sean A. Irvine
 */
public class A042972 extends DecimalExpansionSequence {

  private static final CR N = CR.HALF_PI.exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
