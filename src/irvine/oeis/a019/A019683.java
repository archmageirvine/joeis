package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019683 Decimal expansion of <code>Pi/16</code>.
 * @author Sean A. Irvine
 */
public class A019683 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(16));

  @Override
  protected CR getCR() {
    return N;
  }
}
