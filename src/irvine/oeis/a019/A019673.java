package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019673.
 * @author Sean A. Irvine
 */
public class A019673 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.divide(CR.valueOf(6));

  @Override
  protected CR getCR() {
    return N;
  }
}
