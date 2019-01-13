package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010586.
 * @author Sean A. Irvine
 */
public class A010586 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
