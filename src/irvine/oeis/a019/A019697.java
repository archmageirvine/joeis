package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019697 Decimal expansion of 2*Pi/11.
 * @author Sean A. Irvine
 */
public class A019697 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return N;
  }
}
