package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013662 Decimal expansion of <code>zeta(4)</code>.
 * @author Sean A. Irvine
 */
public class A013662 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(4);

  @Override
  protected CR getCR() {
    return N;
  }
}
