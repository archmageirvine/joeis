package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222072.
 * @author Sean A. Irvine
 */
public class A222072 extends DecimalExpansionSequence {

  private static final CR PI_SQUARED = CR.PI.multiply(CR.PI);
  private static final CR N = PI_SQUARED.multiply(PI_SQUARED).divide(CR.valueOf(384));

  @Override
  protected CR getCR() {
    return N;
  }
}
