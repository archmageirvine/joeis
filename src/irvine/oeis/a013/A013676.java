package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013676.
 * @author Sean A. Irvine
 */
public class A013676 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(18);

  @Override
  protected CR getCR() {
    return N;
  }
}
