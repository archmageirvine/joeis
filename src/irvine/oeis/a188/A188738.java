package irvine.oeis.a188;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A188738 Decimal expansion of <code>e-sqrt(e^2-1)</code>.
 * @author Sean A. Irvine
 */
public class A188738 extends DecimalExpansionSequence {

  private static final CR N = CR.E.subtract(CR.TWO.exp().subtract(CR.ONE).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
