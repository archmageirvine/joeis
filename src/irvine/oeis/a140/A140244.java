package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A140244 Decimal expansion of <code>arccos(-1/4)</code>.
 * @author Sean A. Irvine
 */
public class A140244 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR N = REALS.acos(CR.valueOf(-4).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
