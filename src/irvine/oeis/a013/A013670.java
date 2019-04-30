package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013670 Decimal expansion of <code>zeta(12)</code>.
 * @author Sean A. Irvine
 */
public class A013670 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(12);

  @Override
  protected CR getCR() {
    return N;
  }
}
