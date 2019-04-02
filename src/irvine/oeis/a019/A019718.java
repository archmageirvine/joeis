package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019718.
 * @author Sean A. Irvine
 */
public class A019718 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.valueOf(16));

  @Override
  protected CR getCR() {
    return N;
  }
}
