package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013666.
 * @author Sean A. Irvine
 */
public class A013666 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(8);

  @Override
  protected CR getCR() {
    return N;
  }
}
