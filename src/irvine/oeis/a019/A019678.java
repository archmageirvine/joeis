package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019678.
 * @author Sean A. Irvine
 */
public class A019678 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(11));

  @Override
  protected CR getCR() {
    return N;
  }
}
