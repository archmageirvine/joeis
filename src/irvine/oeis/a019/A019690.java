package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019690.
 * @author Sean A. Irvine
 */
public class A019690 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(23));

  @Override
  protected CR getCR() {
    return N;
  }
}
