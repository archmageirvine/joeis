package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132712 Decimal expansion of 22/Pi.
 * @author Sean A. Irvine
 */
public class A132712 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
