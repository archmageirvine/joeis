package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013668 Decimal expansion of <code>zeta(10)</code>.
 * @author Sean A. Irvine
 */
public class A013668 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(10);

  @Override
  protected CR getCR() {
    return N;
  }
}
