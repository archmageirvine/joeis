package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154905.
 * @author Sean A. Irvine
 */
public class A154905 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(18).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
