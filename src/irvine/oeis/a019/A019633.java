package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019633.
 * @author Sean A. Irvine
 */
public class A019633 extends DecimalExpansionSequence {

  private final CR mN = CR.TAU.multiply(CR.E).sqrt();

  @Override
  protected CR getCR() {
    return mN;
  }
}
