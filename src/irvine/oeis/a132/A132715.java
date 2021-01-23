package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132715 Decimal expansion of 25/Pi.
 * @author Sean A. Irvine
 */
public class A132715 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(25).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
