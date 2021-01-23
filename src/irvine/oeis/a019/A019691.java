package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019691 Decimal expansion of Pi/24.
 * @author Sean A. Irvine
 */
public class A019691 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(24));

  @Override
  protected CR getCR() {
    return N;
  }
}
