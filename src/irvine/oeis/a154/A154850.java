package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154850.
 * @author Sean A. Irvine
 */
public class A154850 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
