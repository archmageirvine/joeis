package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002388 Decimal expansion of <code>Pi^2</code>.
 * @author Sean A. Irvine
 */
public class A002388 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
