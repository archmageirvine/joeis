package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132709 Decimal expansion of 19/Pi.
 * @author Sean A. Irvine
 */
public class A132709 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
