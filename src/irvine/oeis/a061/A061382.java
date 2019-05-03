package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A061382 Decimal expansion of <code>Pi/e</code>.
 * @author Sean A. Irvine
 */
public class A061382 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.E);

  @Override
  protected CR getCR() {
    return N;
  }
}
