package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013661.
 * @author Sean A. Irvine
 */
public class A013661 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.PI).divide(CR.valueOf(6));

  @Override
  protected CR getCR() {
    return N;
  }
}
