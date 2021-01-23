package irvine.oeis.a088;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A088538 Decimal expansion of 4/Pi.
 * @author Sean A. Irvine
 */
public class A088538 extends DecimalExpansionSequence {

  private static final CR N = CR.FOUR.divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
