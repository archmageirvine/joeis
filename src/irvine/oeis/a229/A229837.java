package irvine.oeis.a229;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A229837 Decimal expansion of Sum_{n&gt;=1} 1/(n*n!).
 * @author Sean A. Irvine
 */
public class A229837 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.ei().subtract(CR.GAMMA);

  @Override
  protected CR getCR() {
    return N;
  }
}
