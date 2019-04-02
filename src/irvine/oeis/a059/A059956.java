package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A059956 Decimal expansion of 6/Pi^2.
 * @author Sean A. Irvine
 */
public class A059956 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(6).divide(CR.PI.multiply(CR.PI));

  @Override
  protected CR getCR() {
    return N;
  }
}
