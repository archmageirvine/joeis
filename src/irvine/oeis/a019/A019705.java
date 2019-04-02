package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019705.
 * @author Sean A. Irvine
 */
public class A019705 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.sqrt().divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
