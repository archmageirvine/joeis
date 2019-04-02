package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019693 Decimal expansion of 2*Pi/3.
 * @author Sean A. Irvine
 */
public class A019693 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
