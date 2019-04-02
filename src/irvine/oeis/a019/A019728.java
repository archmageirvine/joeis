package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019728.
 * @author Sean A. Irvine
 */
public class A019728 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt().divide(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
