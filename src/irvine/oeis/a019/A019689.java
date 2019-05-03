package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019689 Decimal expansion of <code>Pi/22</code>.
 * @author Sean A. Irvine
 */
public class A019689 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(22));

  @Override
  protected CR getCR() {
    return N;
  }
}
