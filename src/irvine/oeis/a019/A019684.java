package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019684 Decimal expansion of <code>Pi/17</code>.
 * @author Sean A. Irvine
 */
public class A019684 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(17));

  @Override
  protected CR getCR() {
    return N;
  }
}
