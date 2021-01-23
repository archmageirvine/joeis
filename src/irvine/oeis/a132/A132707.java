package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132707 Decimal expansion of 17/Pi.
 * @author Sean A. Irvine
 */
public class A132707 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
