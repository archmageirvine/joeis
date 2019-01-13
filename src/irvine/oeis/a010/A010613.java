package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010613.
 * @author Sean A. Irvine
 */
public class A010613 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(42), CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
