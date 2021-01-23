package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013678 Decimal expansion of zeta(20).
 * @author Sean A. Irvine
 */
public class A013678 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(20);

  @Override
  protected CR getCR() {
    return N;
  }
}
