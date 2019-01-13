package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010584.
 * @author Sean A. Irvine
 */
public class A010584 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
