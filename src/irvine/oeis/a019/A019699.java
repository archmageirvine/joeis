package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019699.
 * @author Sean A. Irvine
 */
public class A019699 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.divide(CR.valueOf(15));

  @Override
  protected CR getCR() {
    return N;
  }
}
