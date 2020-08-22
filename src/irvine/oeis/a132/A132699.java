package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132699 Decimal expansion of 9/Pi.
 * @author Sean A. Irvine
 */
public class A132699 extends DecimalExpansionSequence {

  private static final CR N = CR.NINE.divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
