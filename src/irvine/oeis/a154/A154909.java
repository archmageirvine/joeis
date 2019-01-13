package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154909.
 * @author Sean A. Irvine
 */
public class A154909 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.FOUR.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
