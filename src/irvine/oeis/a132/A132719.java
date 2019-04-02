package irvine.oeis.a132;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A132719 Decimal expansion of 29/Pi.
 * @author Sean A. Irvine
 */
public class A132719 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(29).divide(CR.PI);

  @Override
  protected CR getCR() {
    return N;
  }
}
