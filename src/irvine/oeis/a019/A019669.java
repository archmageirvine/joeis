package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019669.
 * @author Sean A. Irvine
 */
public class A019669 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
