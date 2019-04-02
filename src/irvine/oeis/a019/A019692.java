package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019692 Decimal expansion of 2*Pi.
 * @author Sean A. Irvine
 */
public class A019692 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.multiply(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
