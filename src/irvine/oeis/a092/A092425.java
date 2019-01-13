package irvine.oeis.a092;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A092425.
 * @author Sean A. Irvine
 */
public class A092425 extends DecimalExpansionSequence {

  private static final CR PI_SQUARED = CR.PI.multiply(CR.PI);
  private static final CR N = PI_SQUARED.multiply(PI_SQUARED);

  @Override
  protected CR getCR() {
    return N;
  }
}
