package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019736 Decimal expansion of sqrt(2*Pi)/19.
 * @author Sean A. Irvine
 */
public class A019736 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt().divide(CR.valueOf(19));

  @Override
  protected CR getCR() {
    return N;
  }
}
