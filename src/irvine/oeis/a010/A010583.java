package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010583 Decimal expansion of cube root of 11.
 * @author Sean A. Irvine
 */
public class A010583 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
