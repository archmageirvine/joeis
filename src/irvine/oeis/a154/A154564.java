package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154564.
 * @author Sean A. Irvine
 */
public class A154564 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
