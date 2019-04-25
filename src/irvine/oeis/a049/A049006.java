package irvine.oeis.a049;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A049006 Decimal expansion of <code>i^i =</code> exp(-Pi/2).
 * @author Sean A. Irvine
 */
public class A049006 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.negate().divide(CR.TWO).exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
