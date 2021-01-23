package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132696 Decimal expansion of 6/Pi.
 * @author Sean A. Irvine
 */
public class A132696 extends DecimalExpansionSequence {

  private static final CR N = CR.SIX.divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
