package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132701 Decimal expansion of 11/Pi.
 * @author Sean A. Irvine
 */
public class A132701 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
