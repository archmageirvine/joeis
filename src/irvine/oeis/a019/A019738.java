package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019738.
 * @author Sean A. Irvine
 */
public class A019738 extends DecimalExpansionSequence {

  private static final CR N = CR.TAU.sqrt().divide(CR.valueOf(23));

  @Override
  protected CR getCR() {
    return N;
  }
}
