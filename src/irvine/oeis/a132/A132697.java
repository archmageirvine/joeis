package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132697 Decimal expansion of 7/Pi.
 * @author Sean A. Irvine
 */
public class A132697 extends DecimalExpansionSequence {

  private static final CR N = CR.SEVEN.divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
