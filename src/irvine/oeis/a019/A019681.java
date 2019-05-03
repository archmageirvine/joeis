package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019681 Decimal expansion of <code>Pi/14</code>.
 * @author Sean A. Irvine
 */
public class A019681 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(14));

  @Override
  protected CR getCR() {
    return N;
  }
}
