package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222069.
 * @author Sean A. Irvine
 */
public class A222069 extends DecimalExpansionSequence {

  private static final CR N = CR.PI.multiply(CR.PI).multiply(CR.SQRT2).divide(CR.valueOf(30));

  @Override
  protected CR getCR() {
    return N;
  }
}
