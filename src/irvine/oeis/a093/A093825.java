package irvine.oeis.a093;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A093825.
 * @author Sean A. Irvine
 */
public class A093825 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(18).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
