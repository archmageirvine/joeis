package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010604 Decimal expansion of cube root of 33.
 * @author Sean A. Irvine
 */
public class A010604 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(33), CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
