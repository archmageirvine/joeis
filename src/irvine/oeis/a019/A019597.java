package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019597.
 * @author Sean A. Irvine
 */
public class A019597 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E);

  @Override
  protected CR getCR() {
    return mN;
  }
}
