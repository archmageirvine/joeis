package irvine.oeis.a344;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A344074 Decimal expansion of Bessel Y_0(1).
 * @author Sean A. Irvine
 */
public class A344074 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.besselY0();

  @Override
  protected CR getCR() {
    return N;
  }
}
