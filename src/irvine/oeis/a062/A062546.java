package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A062546.
 * @author Sean A. Irvine
 */
public class A062546 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.exp().subtract(CR.valueOf(7)).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
