package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019679.
 * @author Sean A. Irvine
 */
public class A019679 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return N;
  }
}
