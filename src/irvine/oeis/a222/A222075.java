package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222075.
 * @author Sean A. Irvine
 */
public class A222075 extends DecimalExpansionSequence {

  private static final CR PI_SQUARED = CR.PI.multiply(CR.PI);
  private static final CR N = PI_SQUARED.multiply(PI_SQUARED).multiply(CR.PI).shiftLeft(6).divide(CR.valueOf(10395));

  @Override
  protected CR getCR() {
    return N;
  }
}
