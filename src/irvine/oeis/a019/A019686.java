package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019686 Decimal expansion of <code>Pi/19</code>.
 * @author Sean A. Irvine
 */
public class A019686 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(19));

  @Override
  protected CR getCR() {
    return N;
  }
}
