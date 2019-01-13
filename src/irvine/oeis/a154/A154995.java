package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154995.
 * @author Sean A. Irvine
 */
public class A154995 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
