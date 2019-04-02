package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010614 Decimal expansion of cube root of 43.
 * @author Sean A. Irvine
 */
public class A010614 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(43), CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
