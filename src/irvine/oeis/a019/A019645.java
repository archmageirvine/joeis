package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019645.
 * @author Sean A. Irvine
 */
public class A019645 extends DecimalExpansionSequence {

  private final CR mN = CR.PI.multiply(CR.E).sqrt();

  @Override
  protected CR getCR() {
    return mN;
  }
}
