package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013664.
 * @author Sean A. Irvine
 */
public class A013664 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(6);

  @Override
  protected CR getCR() {
    return N;
  }
}
