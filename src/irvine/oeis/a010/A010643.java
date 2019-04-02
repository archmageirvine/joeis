package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010643 Decimal expansion of cube root of 73.
 * @author Sean A. Irvine
 */
public class A010643 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(73), CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
