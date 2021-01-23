package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010581 Decimal expansion of cube root of 9.
 * @author Sean A. Irvine
 */
public class A010581 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.NINE, CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
