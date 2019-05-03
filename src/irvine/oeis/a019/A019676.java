package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019676 Decimal expansion of <code>Pi/9</code>.
 * @author Sean A. Irvine
 */
public class A019676 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(9));

  @Override
  protected CR getCR() {
    return N;
  }
}
