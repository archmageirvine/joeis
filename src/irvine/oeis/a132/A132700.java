package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132700 Decimal expansion of <code>Pi/31</code>.
 * @author Sean A. Irvine
 */
public class A132700 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(31));

  @Override
  protected CR getCR() {
    return N;
  }
}
