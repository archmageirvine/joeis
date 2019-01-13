package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154910.
 * @author Sean A. Irvine
 */
public class A154910 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.FIVE.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
