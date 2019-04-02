package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222074 Decimal expansion of (1/1920)*Pi^5.
 * @author Sean A. Irvine
 */
public class A222074 extends DecimalExpansionSequence {

  private static final CR PI_SQUARED = CR.PI.multiply(CR.PI);
  private static final CR N = PI_SQUARED.multiply(PI_SQUARED).multiply(CR.PI).divide(CR.valueOf(1920));

  @Override
  protected CR getCR() {
    return N;
  }
}
