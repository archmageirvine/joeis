package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013674 Decimal expansion of <code>zeta(16)</code>.
 * @author Sean A. Irvine
 */
public class A013674 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(16);

  @Override
  protected CR getCR() {
    return N;
  }
}
