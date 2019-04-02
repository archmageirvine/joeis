package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019688 Decimal expansion of Pi/21.
 * @author Sean A. Irvine
 */
public class A019688 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(21));

  @Override
  protected CR getCR() {
    return N;
  }
}
